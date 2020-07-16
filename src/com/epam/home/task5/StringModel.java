package com.epam.home.task5;

public class StringModel extends Model<String> {

    public StringModel(String model) {
        super(model);
    }

    @Override
    public String getModelString() {
        try {
            return "" + (Integer.parseInt(model) + 1);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка модель ." + e);
            return super.getModelString();
        }
    }
}
