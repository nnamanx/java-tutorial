package generics;

public class CarModels<T, K> {

    T model;
    K serialNo;

    public void setModel(T model) {
        this.model = model;
    }

    public void setSerialNo(K serialNo) {
        this.serialNo = serialNo;
    }

    public T getModel() {
        return model;
    }

    public K getSerialNo() {
        return serialNo;
    }

}
