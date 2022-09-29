package double_dispatch.case1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Rectangle has coordinates and can be checked for overlap against other Rectangles.
 */
@Getter
@RequiredArgsConstructor
public class Rectangle {

	private final int left;
	private final int top;
	private final int right;
	private final int bottom;

	boolean intersectsWith(Rectangle r) {
		return !(
						r.getLeft() > getRight() || r.getRight() < getLeft() || r.getTop() > getBottom() || r.getBottom() < getTop()
		);
	}

	@Override
	public String toString() {
		return String.format("[%d,%d,%d,%d]", getLeft(), getTop(), getRight(), getBottom());
	}
}
