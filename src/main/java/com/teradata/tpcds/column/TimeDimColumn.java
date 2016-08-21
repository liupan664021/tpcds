/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.teradata.tpcds.column;

import com.teradata.tpcds.Table;

import static com.teradata.tpcds.Table.TIME_DIM;
import static com.teradata.tpcds.column.ColumnTypes.IDENTIFIER;
import static com.teradata.tpcds.column.ColumnTypes.INTEGER;
import static com.teradata.tpcds.column.ColumnTypes.charr;

public enum TimeDimColumn
        implements Column
{
    T_TIME_SK(IDENTIFIER),
    T_TIME_ID(charr(16)),
    T_TIME(INTEGER),
    T_HOUR(INTEGER),
    T_MINUTE(INTEGER),
    T_SECOND(INTEGER),
    T_AM_PM(charr(2)),
    T_SHIFT(charr(20)),
    T_SUB_SHIFT(charr(20)),
    T_MEAL_TIME(charr(20));

    private final ColumnType type;

    TimeDimColumn(ColumnType type)
    {
        this.type = type;
    }

    @Override
    public Table getTable()
    {
        return TIME_DIM;
    }

    @Override
    public String getName()
    {
        return name().toLowerCase();
    }

    @Override
    public ColumnType getType()
    {
        return type;
    }
}