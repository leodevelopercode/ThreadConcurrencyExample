package com.leo.dto;

import com.leo.entities.Rows;
import lombok.Data;

/**
 * 气象设备--根据条件获取历史数据
 *
 * @author leo
 * @version 1.0
 */
@Data
public class GetHistoryDataListDTO {

    private Integer pages;

    private Integer limit;

    private Integer totalPages;

    private Integer total;

    private Rows rows;

}
