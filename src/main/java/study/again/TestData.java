package study.again;

class RequestData {
    String data;
    int num;

    public String getData() {return data;}public int getNum() {return num;}
    public void setData(String data) {this.data = data;}public void setNum(int num) {this.num = num;}
}

class ResponseData {
    String message;

    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
}

class Calculator {
    int num;
    int pow;

    public int getNum() {return num;}public int getPow() {return pow;}
    public void setNum(int num) {this.num = num;}public void setPow(int pow) {this.pow = pow;}
}

class CalculatorResult {
    int result;

    public int getResult() {return result;}
    public void setResult(int result) {this.result = result;}
}

public class TestData {
}
