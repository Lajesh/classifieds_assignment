package com.dubizzle.data.mapper.dtotoentity

import com.dubizzle.data.datasource.remote.dto.CommonDto
import com.dubizzle.domain.entity.common.CommonEntity

/**
 * Keep all the DTO to Entity Mapping here
 * Created by Lajesh Dineshkumar
 */

fun <T> CommonDto.CommonResponse<T>.map() = CommonEntity.CommonResponse(
    response = response,
    data = data
)

fun CommonDto.ServerDate.map() = CommonEntity.ServerDate(
    dateTime = dateTime
)

fun CommonDto.Location.map() = CommonEntity.Location(latitude, longitude)
