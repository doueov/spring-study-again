package study.again;

//요청 응답
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

// 거듭제곱
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

// 소문자 => 대문자
class RequestTransform {
    String text;
    String operation;

    public String getText() {return text;}public String getOperation() {return operation;}
    public void setText(String text) {this.text = text;}public void setOperation(String operation) {this.operation = operation;}
}
class ResponseTransform {
    String result;

    public String getResult() {return result;}
    public void setResult(String result) {this.result = result;}
}


public class TestData {
}
