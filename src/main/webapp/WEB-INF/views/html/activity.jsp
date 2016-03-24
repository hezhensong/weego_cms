<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>城市活动详情</title>
    <script type="application/javascript" src="../resource/iscroll.js"></script>
    <script type="text/javascript" src="../resource/jquery-1.3.2.min.js">
    </script>
    <script type="text/javascript" src="../js/main.js">
    </script>
    <link rel="stylesheet" type="text/css" href="../css/activity.css">
</head>

<body>
<div id="wrapper">

    <div id="scroller">
        <ul id="thelist">
            <li class="one"></li>
            <li class="two">
                <p class="title">【&nbsp; ${title}&nbsp;】</p>
                <div class="detail">
                    <img src="../resource/img/activity/details_time@3x.png">
                    <div class="text">
                        <p>时间：${time}</p>
                    </div>
                </div>

                <div class="detail">
                    <img src="../resource/img/activity/details_ip@3x.png">
                    <div class="text">
                        <p>地点：</p>
                        <a>${ip}</a>
                    </div>
                </div>

                <div class="detail">
                    <img src="../resource/img/activity/details_web@3x.png">
                    <div class="text">
                        <p>官网：</p>
                        <a href="blank">${web}</a>
                    </div>
                </div>

                <div class="detail">
                    <img src="../resource/img/activity/details_ticket@3x.png">
                    <div class="text">
                        <p>订票：</p>
                        <a href="blank">${ticket}</a>

                    </div>
                </div>
            </li>

            <li class="three">
                <div class="aty">活动详情</div>
                <div class="drb">
                    剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科
                </div>
            </li>

            <li class="four">
                <h5>团长简介</h5>
                <div class="drb inner">
                    剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科
                </div>
                <img src="">
                <div class="small">(剧院团长：阿宝刻录机呼呼)</div>
            </li>

            <li class="five">
                <div class="drb">
                    剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科
                </div>
                <h5>获奖情况</h5>
                <div class="drb">
                    剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科剧团全称俄罗斯莫斯科
                </div>
                <div class="logo">dddd</div>
            </li>
        </ul>
    </div>
</div>

</body>
</html>