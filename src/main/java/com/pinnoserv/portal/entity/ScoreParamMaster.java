package com.pinnoserv.portal.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "SCORE_PARAM_MASTER")
public class ScoreParamMaster {
    private BigInteger id;
    private String name;
    private String dataType;
    private String dataSource;
    private String computation;
    private BigInteger categoryMasterIdFk;
    private String description;
    private String defaultCriteria;
    private String intrash;
    /*private Collection<ScoreParam> scoreParamsById;
    private ScoreCategoryMaster scoreCategoryMasterByCategoryMasterIdFk;*/

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCORE_PARAM_MASTER_SEQ")
    @SequenceGenerator(name = "SCORE_PARAM_MASTER_SEQ", sequenceName = "SCORE_PARAM_MASTER_SEQ", allocationSize = 1)
    @Column(name = "ID")
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DATA_TYPE")
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "DATA_SOURCE")
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Basic
    @Column(name = "COMPUTATION")
    public String getComputation() {
        return computation;
    }

    public void setComputation(String computation) {
        this.computation = computation;
    }

    @Basic
    @Column(name = "CATEGORY_MASTER_ID_FK")
    public BigInteger getCategoryMasterIdFk() {
        return categoryMasterIdFk;
    }

    public void setCategoryMasterIdFk(BigInteger categoryMasterIdFk) {
        this.categoryMasterIdFk = categoryMasterIdFk;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "DEFAULT_CRITERIA")
    public String getDefaultCriteria() {
        return defaultCriteria;
    }

    public void setDefaultCriteria(String defaultCriteria) {
        this.defaultCriteria = defaultCriteria;
    }

    @Basic
    @Column(name = "INTRASH")
    public String getIntrash() {
        return intrash;
    }

    public void setIntrash(String intrash) {
        this.intrash = intrash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreParamMaster that = (ScoreParamMaster) o;
        return id == that.id && categoryMasterIdFk == that.categoryMasterIdFk && Objects.equals(name, that.name) && Objects.equals(dataType, that.dataType) && Objects.equals(dataSource, that.dataSource) && Objects.equals(computation, that.computation) && Objects.equals(description, that.description) && Objects.equals(defaultCriteria, that.defaultCriteria) && Objects.equals(intrash, that.intrash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dataType, dataSource, computation, categoryMasterIdFk, description, defaultCriteria, intrash);
    }

    /*@OneToMany(mappedBy = "scoreParamMasterByMasterParamIdFk")
    public Collection<ScoreParam> getScoreParamsById() {
        return scoreParamsById;
    }

    public void setScoreParamsById(Collection<ScoreParam> scoreParamsById) {
        this.scoreParamsById = scoreParamsById;
    }

    @ManyToOne
    @JoinColumn(name = "CATEGORY_MASTER_ID_FK", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public ScoreCategoryMaster getScoreCategoryMasterByCategoryMasterIdFk() {
        return scoreCategoryMasterByCategoryMasterIdFk;
    }

    public void setScoreCategoryMasterByCategoryMasterIdFk(ScoreCategoryMaster scoreCategoryMasterByCategoryMasterIdFk) {
        this.scoreCategoryMasterByCategoryMasterIdFk = scoreCategoryMasterByCategoryMasterIdFk;
    }*/
}
