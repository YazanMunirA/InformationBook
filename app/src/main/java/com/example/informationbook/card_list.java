package com.example.informationbook;

public class card_list {
    private String ImageName;
    private String CategoryName;

    public card_list(String imageName, String categoryName) {
        ImageName = imageName;
        CategoryName = categoryName;
    }

    public String getImageName() {
        return ImageName;
    }

    public String getCategoryName() {
        return CategoryName;
    }
}
