package com.app.al.wifi.model

import android.content.Context
import android.widget.Toast
import com.app.al.wifi.viewmodel.WifiListItemViewModel

/**
 * WIFI情報一覧Model
 *
 * @param context Context
 */
class WifiListModel(private val context: Context) {

  /**
   * WIFI情報一覧押下時イベント
   *
   * @param wifiListItemViewModel WIFI情報ViewModel
   */
  fun show(wifiListItemViewModel: WifiListItemViewModel) {
    Toast.makeText(context, "Clicked on $wifiListItemViewModel.getSsId", Toast.LENGTH_LONG).show()
  }
}