package chain_of_responsibility.case4;

public class File {

	private final String name;
	private final String type;
	private final String path;

	public File(String name, String type, String path) {
		this.name = name;
		this.type = type;
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getPath() {
		return path;
	}

	@Override
	public String toString() {
		return "File{" +
						"name='" + name + '\'' +
						", type='" + type + '\'' +
						", path='" + path + '\'' +
						'}';
	}
}
