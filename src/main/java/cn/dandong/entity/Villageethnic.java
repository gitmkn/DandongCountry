package cn.dandong.entity;

import java.math.BigDecimal;

public class Villageethnic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column villageethnic.vid
     *
     * @mbg.generated Tue Jul 30 23:13:35 CST 2019
     */
    private Villagebasicinfo villagebasicinfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column villageethnic.percent
     *
     * @mbg.generated Tue Jul 30 23:13:35 CST 2019
     */
    private BigDecimal percent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column villageethnic.vid
     *
     * @return the value of villageethnic.vid
     *
     * @mbg.generated Tue Jul 30 23:13:35 CST 2019
     */
    public Villagebasicinfo getVillagebasicinfo() {
        return villagebasicinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column villageethnic.vid
     *
     * @param villagebasicinfo the value for villageethnic.vid
     *
     * @mbg.generated Tue Jul 30 23:13:35 CST 2019
     */
    public void setVillagebasicinfo(Villagebasicinfo villagebasicinfo) {
        this.villagebasicinfo = villagebasicinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column villageethnic.percent
     *
     * @return the value of villageethnic.percent
     *
     * @mbg.generated Tue Jul 30 23:13:35 CST 2019
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column villageethnic.percent
     *
     * @param percent the value for villageethnic.percent
     *
     * @mbg.generated Tue Jul 30 23:13:35 CST 2019
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }
}