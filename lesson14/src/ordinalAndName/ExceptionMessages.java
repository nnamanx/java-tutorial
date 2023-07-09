package ordinalAndName;

public enum ExceptionMessages {
//    the error numbers are random
    USERNOFOUND(404),
    IDNOTFOUND(505),
    LISTISEMPTY(606);
    int errorNum;


    ExceptionMessages(int errorNum) {
        this.errorNum = errorNum;
    }

    public int getErrorNum (){
        return errorNum;
    }


}
