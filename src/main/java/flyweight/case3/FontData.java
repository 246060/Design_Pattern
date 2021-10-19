package flyweight.case3;

import java.awt.*;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

public class FontData {

    private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData = new WeakHashMap<>();

    private final int pointSize;
    private final String fontFace;
    private final Color color;
    private final Set<FontEffect> effects;

    public FontData(int pointSize, String fontFace, Color color, Set<FontEffect> effects) {
        this.pointSize = pointSize;
        this.fontFace = fontFace;
        this.color = color;
        this.effects = effects;
    }

    public static FontData create(int pointSize, String fontFace, Color color, FontEffect... effects) {

        EnumSet<FontEffect> effectEnumSet = EnumSet.noneOf(FontEffect.class);
        for (FontEffect effect : effects) {
            effectEnumSet.add(effect);
        }

        // 객체를 생성하는데 드는 비용이나 객체가 차지하는 메모리 공간에 대해 걱정할 필요가 없다.
        FontData data = new FontData(pointSize, fontFace, color, effectEnumSet);

        if (!flyweightData.containsKey(data)) {
            flyweightData.put(data, new WeakReference<>(data));
        }

        // 해시값에 따라 변경불가능한 단일본을 리턴
        return flyweightData.get(data)
                            .get();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FontData) {
            if (obj == this) return true;

            FontData other = (FontData) obj;
            return other.pointSize == pointSize
                    && other.fontFace.equals(fontFace)
                    && other.color.equals(color)
                    && other.effects.equals(effects);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (pointSize * 37 + effects.hashCode() * 13) * fontFace.hashCode();
    }

    // Getters for the font data, but no setters. FontData is immutable.
    public int getPointSize() {return pointSize; }
    public String getFontFace() {return fontFace; }
    public Color getColor() {return color; }
}
