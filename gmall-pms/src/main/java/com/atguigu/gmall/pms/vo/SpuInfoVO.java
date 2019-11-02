package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import lombok.Data;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-11-01 9:00
 */
@Data
public class SpuInfoVO extends SpuInfoEntity
{
    private List<String> spuImages;

    private List<ProductAttrValueVO> baseAttrs;

    private List<SkuInfoVO> skus;
}
















