package com.app.al.wifi.common

import android.Manifest.permission

/**
 * 定数
 */
object Const {

  // 汎用
  val EMPTY = ""
  val DOUBLE_QUOTE = "\""

  // パスワード
  val REGEX_WEP = "[0-9A-Fa-f]*"
  val REGEX_PSK = "[0-9A-Fa-f]{64}"

  // 権限
  val PERMISSIONS = arrayOf(
      permission.ACCESS_NETWORK_STATE,
      permission.ACCESS_WIFI_STATE,
      permission.ACCESS_COARSE_LOCATION,
      permission.CHANGE_WIFI_STATE
  )

  // WIFIセキュリティ
  enum class SECURITY_TYPE(val securityType: String) {
    SECURITY_NONE("NONE"),
    SECURITY_WEP("WEP"),
    SECURITY_PSK("PSK"),
  }
}