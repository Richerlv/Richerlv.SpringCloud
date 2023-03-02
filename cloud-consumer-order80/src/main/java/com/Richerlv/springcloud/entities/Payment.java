package com.Richerlv.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author: Richerlv
 * @date: 2023/3/3 0:13
 * @description:
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Repository
public class Payment implements Serializable {

    private Long id;
    private String serial;
}

