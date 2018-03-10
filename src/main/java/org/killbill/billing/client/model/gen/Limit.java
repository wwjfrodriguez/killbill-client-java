/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Limit extends KillBillObject {

    private String unit = null;

    private String max = null;

    private String min = null;

    public Limit unit(String unit) {
        this.unit = unit;
        return this;
    }

    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Limit max(String max) {
        this.max = max;
        return this;
    }

    
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public Limit min(String min) {
        this.min = min;
        return this;
    }

    
    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Limit limit = (Limit) o;
        return Objects.equals(this.unit, limit.unit) &&
        Objects.equals(this.max, limit.max) &&
        Objects.equals(this.min, limit.min);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, max, min);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Limit {\n");
        
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
