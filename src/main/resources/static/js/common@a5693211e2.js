/*! Copyright@2008-2017 zuche.com All Rights Reserved.2019-07-24 */
function CNNIC_change(eleId) {
    var str = document.getElementById(eleId).href, str1 = str.substring(0, str.length - 6);
    str1 += CNNIC_RndNum(6), document.getElementById(eleId).href = str1
}

function CNNIC_RndNum(k) {
    for (var rnd = "", i = 0; i < k; i++) rnd += Math.floor(10 * Math.random());
    return rnd
}

define("", [], function (require, exports, module) {
    require("public/utils/inpututils"), require("public/common/header"), require("public/common/bdshare")
}), define("public/utils/inpututils", [], function (require, exports, module) {
    inputUtils = {}, inputUtils.initInputstate = function (element) {
        $(element).focus(function () {
            $(this).val() == this.defaultValue && ($(this).val(""), $(this).css("border", "1px solid #61a1df"))
        }).blur(function () {
            $(this).val() || ($(this).val(this.defaultValue).css({color: "#b9b9b9"}), $(this).css("border", "1px solid #e2e2e2"))
        }).keydown(function () {
            $(this).val() == this.defaultValue ? $(this).css({color: "#b9b9b9"}) : ($(this).css({color: "#61a1df"}), $(this).css("border", "1px solid #e2e2e2"))
        })
    }, inputUtils.handleInputstate = function (element) {
        $(element).each(function (i, inpt) {
            $(inpt).val() || ($(inpt).val($(inpt).attr("default-value")), $(this).removeClass("colorBlue")), $(inpt).val() && $(inpt).val() != $(inpt).attr("default-value") && $(this).addClass("colorBlue"), $(inpt).focus(function () {
                $(this).val() == $(this).attr("default-value") && ($(this).val(""), $(this).addClass("colorBlue"))
            }).blur(function () {
                $(this).val() || ($(this).val($(this).attr("default-value")), $(this).removeClass("colorBlue"))
            })
        })
    }, inputUtils.addInputStyle = function (element1, element2) {
        $(element1).add(element2).focus(function () {
            $(this).val() == this.defaultValue && $(this).val("")
        }).blur(function () {
            var txt_value = $(this).val();
            txt_value && "请选择" != txt_value ? $(this).css({color: "#000000"}) : $(this).val(this.defaultValue).css({color: "#666666"})
        }).keydown(function () {
            $(this).val() == this.defaultValue ? $(this).css({color: "#666666"}) : $(this).css({color: "#000"})
        })
    }, inputUtils.pwdInputHandle = function (textElement, pwdElement) {
        var tx = $(textElement), pwd = $(pwdElement), defaultValue = "";
        tx.focus(function () {
            $(this).val() != this.defaultValue && (defaultValue = this.defaultValue, $(this).hide(), pwd.show(), pwd.val(""), pwd.focus())
        }), pwd.blur(function () {
            $(this).val() || ($(this).hide(), tx.show(), tx.val(defaultValue))
        })
    }, module.exports = inputUtils
}), define("public/common/header", [], function (require, exports, module) {
    function checkLogin() {
        if ($("#mebId").val()) {
            var memberName = webUtils.getCookieValue("realName");
            $("#notLogin").hide(), $("#topLoginName").html("你好，" + decodeURIComponent(memberName)), $("#alreadyLogin").show()
        } else $("#alreadyLogin").hide(), $("#notLogin").show(), $("#loginBT").bind("click", function () {
            webUtils.loginSys()
        })
    }

    webUtils = require("public/utils/webutils"), $(function () {
        function onWidthChange() {
            $(window).width() < 1190 ? $(".sz_menu ul").addClass("w980") : $(".sz_menu ul").removeClass("w980"), setTimeout(onWidthChange, 1e3)
        }

        checkLogin(), $(".telDown").hover(function () {
            $(this).children("img").show()
        }, function () {
            $(this).children("img").hide()
        }), $("#mouseoverDiv").mouseover(function () {
            $("#phoneszlist").show()
        }).mouseout(function () {
            $("#phoneszlist").hide()
        }), setTimeout(onWidthChange, 1e3), $(".morecur").hover(function () {
            $(this).addClass("morecur_cur"), $(this).find("div.sz_more_menu").show()
        }, function () {
            $(this).removeClass("morecur_cur"), $(this).find("div.sz_more_menu").hide()
        }), $(".sz-szbts a.close").click(function () {
            $(".sz-szbtsbox").remove()
        }), $(".zc_index_my").each(function () {
            $(this).hoverDelay({
                outDuring: 500, hoverEvent: function () {
                    $(this).children("div.contmyszlist").show()
                }, outEvent: function () {
                    $(this).children("div.contmyszlist").hide()
                }
            })
        })
    })
}), define("public/utils/webutils", [], function (require, exports, module) {
    var dateUtils = require("public/utils/dateutils");
    webUtils = {}, window.MzBrowser = {}, function () {
        if (!MzBrowser.platform) {
            var ua = window.navigator.userAgent;
            MzBrowser.platform = window.navigator.platform, MzBrowser.firefox = ua.indexOf("Firefox") > 0, MzBrowser.opera = "object" == typeof window.opera, MzBrowser.ie = !MzBrowser.opera && ua.indexOf("MSIE") > 0, MzBrowser.mozilla = "Gecko" == window.navigator.product, MzBrowser.netscape = "Netscape" == window.navigator.vendor, MzBrowser.safari = ua.indexOf("Safari") > -1;
            var re = null;
            MzBrowser.firefox ? re = /Firefox(\s|\/)(\d+(\.\d+)?)/ : MzBrowser.ie ? re = /MSIE( )(\d+(\.\d+)?)/ : MzBrowser.opera ? re = /Opera(\s|\/)(\d+(\.\d+)?)/ : MzBrowser.netscape ? re = /Netscape(\s|\/)(\d+(\.\d+)?)/ : MzBrowser.safari ? re = /Version(\/)(\d+(\.\d+)?)/ : MzBrowser.mozilla && (re = /rv(\:)(\d+(\.\d+)?)/), re && re.test(ua) && (MzBrowser.version = parseFloat(RegExp.$2))
        }
    }(), webUtils.getCookieValue = function (name) {
        var cookies = document.cookie;
        if (cookies.length > 0) {
            var cookieArray = cookies.split(";");
            if (cookieArray.length > 0) for (var i = 0; i < cookieArray.length; i++) {
                var cookie = cookieArray[i];
                if (cookie.indexOf(name) > -1) {
                    var value = cookie.substring(cookie.indexOf("=") + 1, cookie.length);
                    return value
                }
            }
        }
    }, webUtils.loginSys = function () {
        var historyLocation = "shenzhou/login/login.html";
        /*var historyLocation = "" + window.location;*/
        $("#historyLocation").val(historyLocation), $("#loginTopForm").submit()
    }, webUtils.checkIdentitycloseday = function () {
        var overIdentitycloseday = !1, identitycloseday = $("#identitycloseday").val(),
            identityCardType = $("#identityCardType").val();
        if (identitycloseday) {
            if ("10" == identityCardType) return !1;
            identitycloseday += " 00:00";
            var currentTime = $("#currentDateStr").val();
            currentTime || (currentTime = dateUtils.formatDateNew(new Date)), dateUtils.DateDiffToMinute(identitycloseday, currentTime) < 0 && (overIdentitycloseday = !0)
        }
        return overIdentitycloseday
    }, module.exports = webUtils
}), define("public/utils/dateutils", [], function (require, exports, module) {
    dateUtils = {}, dateUtils.formatDateNew = function (v) {
        if ("string" == typeof v && (v = parseDate(v)), v instanceof Date) {
            var y = v.getFullYear(), m = v.getMonth() + 1;
            m = m < 10 ? "0" + m : m;
            var d = v.getDate();
            d = d < 10 ? "0" + d : d;
            var h = v.getHours();
            h = h < 10 ? "0" + h : h;
            var i = v.getMinutes();
            return i = i < 10 ? "0" + i : i, y + "-" + m + "-" + d + " " + h + ":" + i
        }
        return ""
    }, dateUtils.formatDay = function (v) {
        if ("string" == typeof v && (v = parseDate(v)), v instanceof Date) {
            var y = v.getFullYear(), m = v.getMonth() + 1;
            m = m < 10 ? "0" + m : m;
            var d = v.getDate();
            return d = d < 10 ? "0" + d : d, y + "-" + m + "-" + d
        }
        return ""
    }, dateUtils.dateAddMonths = function (_date, value) {
        var pDate, aDate, tDate, oDate1;
        pDate = _date.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate1 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]);
        var date = oDate1.setMonth(oDate1.getMonth() + value), limitdate = new Date(date);
        return dateUtils.formatDateNew(limitdate)
    }, dateUtils.dateAddDay = function (_date, day) {
        day || (day = 0);
        var time = _date.split("-"), now = new Date(time[0], time[1] - 1, time[2]),
            milliseconds = 1e3 * day * 60 * 60 * 24, testdate = milliseconds + now.getTime(), testDate = new Date;
        return testDate.setTime(testdate), dateUtils.formatDateNew(testDate).substring(0, 10)
    }, dateUtils.dateAddMinute = function (_date, minute) {
        minute || (minute = 0);
        var timeArray = _date.split(" "), time = timeArray[0].split("-"), hour = timeArray[1].split(":"),
            now = new Date(time[0], time[1] - 1, time[2], hour[0], hour[1]), milliseconds = 1e3 * minute * 60,
            testdate = milliseconds + now.getTime(), testDate = new Date;
        return testDate.setTime(testdate), dateUtils.formatDateNew(testDate)
    }, dateUtils.convertDate = function (_date, day) {
        var time = _date.split("-"), now = new Date(time[0], time[1] - 1, time[2]),
            milliseconds = 1e3 * day * 60 * 60 * 24, testdate = milliseconds + now.getTime(), testDate = new Date;
        return testDate.setTime(testdate), testDate
    }, dateUtils.DateDiffToDay = function (sDate, eDate) {
        var pDate, aDate, tDate, oDate1, oDate2, iDays;
        return pDate = sDate.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate1 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]), pDate = eDate.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate2 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]), iDays = (oDate1 - oDate2) / 1e3 / 60 / 60 / 24, iDays = Math.ceil(iDays)
    }, dateUtils.DateDiffToHour = function (sDate, eDate) {
        var pDate, aDate, tDate, oDate1, oDate2;
        return pDate = sDate.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate1 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]), pDate = eDate.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate2 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]), (oDate1 - oDate2) / 1e3 / 60 / 60
    }, dateUtils.DateDiffToMinute = function (sDate, eDate) {
        var pDate, aDate, tDate, oDate1, oDate2;
        return pDate = sDate.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate1 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]), pDate = eDate.split(" "), aDate = pDate[0].split("-"), tDate = pDate[1].split(":"), oDate2 = new Date(aDate[0], aDate[1] - 1, aDate[2], tDate[0], tDate[1]), (oDate1 - oDate2) / 1e3 / 60
    }, dateUtils.culculateCurrentTime = function (pageSystemDate, pageClientSecond) {
        var currentClientSecond = (new Date).getTime();
        if (currentClientSecond > pageClientSecond) {
            var minuteChange = Math.ceil((currentClientSecond - pageClientSecond) / 6e4);
            return dateUtils.dateAddMinute(pageSystemDate, minuteChange)
        }
        return pageSystemDate
    }, module.exports = dateUtils
});