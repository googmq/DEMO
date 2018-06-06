package cn.minqi.consumer.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GetSomeThingResponse {

    private Long id;

    private String name;

    private String age;

    private String details;
}
