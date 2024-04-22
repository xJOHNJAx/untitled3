package Homework;

class MyBaseClass {
    public void processValue(int value) throws MyCheckedException, MySubclassCheckedException {
        if (value < 0) {
            throw new MyCheckedException("Значение не может быть отрицательным");
        }
    }
}
