package com.gccloud.dataroom.core.module.chart.components;

import com.gccloud.dataroom.core.constant.PageDesignConstant;
import com.gccloud.dataroom.core.module.chart.bean.Chart;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 数字
 * @author hongyang
 * @version 1.0
 * @date 2023/10/12 17:23
 */
@Data
public class ScreenNumbersChart extends Chart {
    
    @ApiModelProperty(notes = "组件类型")
    private String type = PageDesignConstant.BigScreen.Type.NUMBER;

    @ApiModelProperty(notes = "个性化")
    private Customize customize = new Customize();

    @Data
    public static class Customize {

        @ApiModelProperty(notes = "字体大小")
        private Integer fontSize;

        @ApiModelProperty(notes = "字体粗细")
        private Integer fontWeight;

        @ApiModelProperty(notes = "字体")
        private String fontFamily;

        @ApiModelProperty(notes = "字体颜色")
        private String color;

        @ApiModelProperty(notes = "标题")
        private String title;

    }
}
