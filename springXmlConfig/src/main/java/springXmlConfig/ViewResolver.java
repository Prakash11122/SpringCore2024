package springXmlConfig;

public class ViewResolver {
	
	
	private String prefix;
	
	private String suffix;

	public ViewResolver(String prefix, String suffix) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public ViewResolver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		return "ViewResolver [prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	

}
