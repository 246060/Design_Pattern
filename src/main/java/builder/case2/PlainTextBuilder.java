package builder.case2;

public class PlainTextBuilder implements Builder {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeHeader(String title) {
        sb.append(title).append("\n");
    }

    @Override
    public void makeBody(String body) {
        sb.append(body).append("\n");
    }

    @Override
    public void makeFooter(String tail) {
        sb.append(tail).append("\n");
    }

    @Override
    public String getResult() {
        return sb.toString();
    }
}
