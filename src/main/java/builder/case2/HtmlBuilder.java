package builder.case2;

public class HtmlBuilder implements Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeHeader(String title) {
        sb.append(title);
    }

    @Override
    public void makeBody(String body) {
        sb.append(body);
    }

    @Override
    public void makeFooter(String tail) {
        sb.append(tail);
    }

    @Override
    public String getResult() {
        return sb.toString();
    }
}
