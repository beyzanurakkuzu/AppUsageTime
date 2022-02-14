package com.beyzaakkuzu.usagestatsdeneme

class UsageAppStateObj {

    var appPackageName = ""
    var appName = ""
    var appStartTime = 0L
    var appEndTime = 0L


    fun appUseTime(): Int {
        var useTime = ((appEndTime - appStartTime) / 1000).toInt()
        if (useTime < 0) {
            useTime = 0
        }
        return useTime
    }


}
