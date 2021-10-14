package org.zerock.sample;

import lombok.*;
import org.springframework.stereotype.Component;


@Component
@ToString
@Getter

//-- 1. AllArgsConstructor 어노테이션으로 모든 필드를 파라미터로 갖는 생성자 생성
//@AllArgsConstructor

//--2. 특정 변수에 대해서만 생성자 작성하고 싶을 때,
//     RequiredArgsConstructor 어노테이션 + @NonNull 어노테이션 사용
@RequiredArgsConstructor

// 생성자를 통한 주입 (스프링 4.3 이후, @Autowired 어노테이션 없이 묵시적으로 주입 처리)
// 객체 생성시 의존성 주입하므로, 더 엄격하게 체크함
public class SampleHotel {

    @NonNull
    private Chef chef;

    //--3. 생성자 직접 작성
//    public SampleHotel(Chef chef){
//
//        this.chef = chef;
//    } //constructor

} //end class
