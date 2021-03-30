package de.coldtea.smplr.smplralarm.extensions

import de.coldtea.smplr.smplralarm.models.AlarmItem
import de.coldtea.smplr.smplralarm.models.NotificationItem
import de.coldtea.smplr.smplralarm.repository.entity.AlarmNotificationEntity
import de.coldtea.smplr.smplralarm.repository.entity.NotificationEntity

fun NotificationEntity.convertToNotificationItem() =
    NotificationItem(
        smallIcon,
        title,
        message,
        bigText,
        autoCancel
    )

fun AlarmNotificationEntity.convertToAlarmItem() =
    AlarmItem(
        alarmNotificationId,
        hour,
        min,
        activeDaysAsWeekdaysList().orEmpty()
    )