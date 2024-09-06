package study.again;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test2")
    @ResponseBody
    public ResponseData test2(@RequestBody RequestData data) {
        System.out.println(data.getData());
        System.out.println(data.getNum());
        ResponseData responseData = new ResponseData();
        responseData.setMessage("bye");
        return responseData;
    }

    // 1. JSON 데이터(문자열)이 도착
    // 2. (데이터컨버터) 내부적으로 Jackson 라이브버리를 활용하여 JSON데이터(문자열)에서 내용을 추출
    // 3. 객체를 생성 => CalculatorResult로 추출
    // 4. 객체 내용을 채움 (세터 메서드) => "num", "pow" => setNum, setPow를 호출해서 내용 지우기
    // 5. 객체를 메서드 핸들러의 파라미터로 전달
    @PostMapping("/power")
    @ResponseBody
    public CalculatorResult power(@RequestBody Calculator cal) {
        int result = 1;
        CalculatorResult calculatorResult = new CalculatorResult();
        for (int i = 0; i < cal.getPow(); i++) {
            result *= cal.getNum();
        }
        calculatorResult.setResult(result);
        return calculatorResult;
    }

}
