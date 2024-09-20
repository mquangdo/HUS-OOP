package midterm2021.quest1;
abstract class Number {
    private long serialVersionUID;
    public Number(){
        this.serialVersionUID = 0;
    }

    public byte byteValue(){
        return 1;
    }

    abstract double doubleValue();

    abstract float floatValue();
    abstract int intValue();
    abstract long longValue();
    abstract short shortValue();
}
