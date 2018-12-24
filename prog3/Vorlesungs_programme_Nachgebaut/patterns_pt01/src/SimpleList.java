public interface SimpleList <ValueType> extends BasicList<ValueType> {
    @Override
    default public void add(ValueType val){

    }
    @Override
    default public void remove(ValueType val){

    }
}
