// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: BSD-2-Clause

package com.example.integrationguide

private val capsRegex = Regex("[A-Z]")

fun String.camelSpaced(): String {
    return capsRegex.replace(this) {" " + it.value}
}
