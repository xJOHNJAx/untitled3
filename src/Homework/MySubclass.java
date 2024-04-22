package Homework;

class MySubclass extends MyBaseClass {
    @Override
    public void processValue(int value) throws MySubclassCheckedException, MyCheckedException {
        if (value > 100) {
            throw new MySubclassCheckedException("Значение не может быть больше 100");
        }
        super.processValue(value);
    }
}