package com.Richerlv.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author: Richerlv
 * @date: 2023/3/2 15:58
 * @description:
 */


@Data
@Repository
public class Payment implements Serializable {

    private Long id;
    private String serial;

    public Payment() {
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }
}
