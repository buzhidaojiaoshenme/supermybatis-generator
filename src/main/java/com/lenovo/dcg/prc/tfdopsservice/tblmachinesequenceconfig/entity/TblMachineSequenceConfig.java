package com.lenovo.dcg.prc.tfdopsservice.tblmachinesequenceconfig.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TblMachineSequenceConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private String machineno;

    private String subjectid;

    private String subjectvalue;

    private LocalDateTime createtime;

    private String sourceflag;

    private String migrateId;

    private String remark;


}
