/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Entity {

    private DateTime createdDate = null;

    private DateTime updatedDate = null;

    private UUID id = null;


    public Entity() {
    }

    public Entity(final DateTime createdDate,
                     final DateTime updatedDate,
                     final UUID id) {
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.id = id;

    }


    public Entity setCreatedDate(final DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public Entity setUpdatedDate(final DateTime updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public DateTime getUpdatedDate() {
        return updatedDate;
    }

    public Entity setId(final UUID id) {
        this.id = id;
        return this;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entity entity = (Entity) o;
        return Objects.equals(this.createdDate, entity.createdDate) &&
        Objects.equals(this.updatedDate, entity.updatedDate) &&
        Objects.equals(this.id, entity.id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDate,
                            updatedDate,
                            id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entity {\n");
        
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

