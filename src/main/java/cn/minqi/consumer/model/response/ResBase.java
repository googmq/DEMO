package cn.minqi.consumer.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResBase<T> {
    private Integer returnCode;
    private String message;
    private T result;
}
