package com.app.al.wifi.viewmodel

import com.app.al.wifi.event.StartActivityEvent
import com.app.al.wifi.viewmodel.base.BaseDialogViewModel
import org.greenrobot.eventbus.EventBus

/**
 * 権限ダイアログViewModel
 */
class PermissionDialogViewModel : BaseDialogViewModel() {

  /**
   * PositiveButton押下
   */
  fun onPositiveButtonClicked() {
    EventBus.getDefault().post(StartActivityEvent(StartActivityEvent.OS_SETTING))
  }
}