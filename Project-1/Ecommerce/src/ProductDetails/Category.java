package ProductDetails;

public class Category {
	private String catogoryName;
	private Category[] subCategories;

	public String getCatogoryName() {
		return catogoryName;
	}

	public void setCatogoryName(String catogoryName) {
		this.catogoryName = catogoryName;
	}

	public Category[] getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Category[] subCategories) {
		this.subCategories = subCategories;
	}

}
