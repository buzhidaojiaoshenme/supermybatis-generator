package com.lenovo.dcg.prc.tfdopsservice.epservicereg.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 销售注册主机服务产品
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EpServicereg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务注册ID
     */
    private String serviceregid;

    /**
     * 服务号
     */
    private String svcprodno;

    /**
     * 主机号
     */
    private String machineNo;

    /**
     * 生产批次
     */
    private String svcprojno;

    /**
     * 服务开始时间
     */
    private LocalDateTime servicestartdate;

    /**
     * 服务结束时间
     */
    private LocalDateTime serviceenddate;

    /**
     * 备件开始
     */
    private LocalDateTime partstartdate;

    /**
     * 备件结束
     */
    private LocalDateTime partenddate;

    /**
     * 人工开始
     */
    private LocalDateTime laborstartdate;

    /**
     * 人工结束
     */
    private LocalDateTime laborenddate;

    /**
     * 上门开始
     */
    private LocalDateTime onsitestartdate;

    /**
     * 上门结束
     */
    private LocalDateTime onsiteenddate;

    /**
     * 初始可用次数
     */
    private Integer inittimes;

    /**
     * 可用次数
     */
    private Integer usedtimes;

    /**
     * 数据来源
     */
    private String sourceflag;

    /**
     * 备件
     */
    private String remark;

    /**
     * 删除标识
     */
    private Integer deleteflag;

    /**
     * 创建人
     */
    private String createby;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 修改人
     */
    private String updateby;

    /**
     * 修改时间
     */
    private LocalDateTime updatetime;

    /**
     * POSA编码
     */
    private String cardno;

    private String hdsaleoderno;

    /**
     * 是否固定时间 V自动计算 P固定
     */
    private String effecttype;

    private String ponum;


}
