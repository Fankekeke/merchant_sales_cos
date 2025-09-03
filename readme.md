### 基于SpringBoot + Vue的药店销售配送管理库存管理系统.

#### 安装环境

JAVA 环境 

Node.js环境 [https://nodejs.org/en/] 选择14.17

Yarn 打开cmd， 输入npm install -g yarn !!!必须安装完毕nodejs

Mysql 数据库 [https://blog.csdn.net/qq_40303031/article/details/88935262] 一定要把账户和密码记住

redis

Idea 编译器 [https://blog.csdn.net/weixin_44505194/article/details/104452880]

WebStorm OR VScode 编译器 [https://www.jianshu.com/p/d63b5bae9dff]

#### 采用技术及功能

后端：SpringBoot、MybatisPlus、MySQL、Redis、
前端：Vue、Apex、Antd、Axios

平台前端：vue(框架) + vuex(全局缓存) + rue-router(路由) + axios(请求插件) + apex(图表)  + antd-ui(ui组件)

平台后台：springboot(框架) + redis(缓存中间件) + shiro(权限中间件) + mybatisplus(orm) + restful风格接口 + mysql(数据库)

开发环境：windows10 or windows7 ， vscode or webstorm ， idea + lambok


#### 前台启动方式
安装所需文件 yarn install 
运行 yarn run dev

#### 默认后台账户密码
[管理员]
admin
1234qwer

###### 管理员：
用户地址 、公告管理 、药品管理 、订单评价 、积分兑换 、商品积分 、会员积分 、药店管理 、药店会员 、订单管理 、员工管理 、用户管理 、采购记录 、药品类型 、药品收藏 、贴子模块 、贴子列表 、消息回复 、供应商管理 、药品采购 、库存预警 、采购物流 、药店库存 、数据统计 、薪资发放 、问题检查 、保质期预警 、订单模板 、员工考勤。

###### 药店：
药店注册登录、密码修改、药品管理 、订单评价 、药店会员 、订单管理 、员工管理 、药店信息 、会员积分 、采购记录 、员工薪资 、员工考勤 、采购供应 、药品采购 、库存预警 、采购物流 、药店库存 、问题检查 、保质期预警 、药店收入支出数据统计。

###### 员工：
员工登录、密码修改、药品管理 、订单评价 、药店会员 、订单管理 、我的考勤 、我的薪资 、我的信息 、药店采购 、药品采购 、库存预警 、采购物流 、药店库存 、问题检查 、保质期预警。

###### 用户：
注册登录、密码修改、个人信息 、我的订单 、订单评价 、在线支付 、兑换记录 、积分兑换 、收货地址 、药品收藏 、我的贴子 、消息回复。

#### 项目截图
暂无

|  |  |
|---------------------|---------------------|
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/5086ad8e-e240-4cff-a24f-63a3cf1f7f40.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/d3412132-00da-487d-8a39-bc7990b13405.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/0887aed8-ea94-4680-95ae-eeddbde76c9d.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/d07b9bed-25b2-4e13-88ea-f97f508517bf.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/824c42a6-5118-459a-9ff6-2ac3737cfb60.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/cf148c60-e4bb-473a-9386-7b2c240d3d40.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/556cb377-f89c-42ff-bc0b-ec87e32e3ee5.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/cc156eec-1707-4c22-b6da-93c8a9426ccb.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/67bc8e1d-2201-422e-818d-57a5adea5a91.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/c8cad3bf-7500-4c52-a62b-521da35442ea.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/41e3d408-aa20-479c-8759-1fdb15ff3da6.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/bcdbaea7-9b27-4fc5-93ad-37c43e7eb7c2.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/08aa5dad-1195-4e6a-a793-5a1f6201d1fc.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/bb4eebd9-995c-4908-b704-b287b95d9abf.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/7a10f92c-9f7e-4b4f-bc0b-e356019fa198.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/ae18bbe7-7ed2-4947-b3a8-271cc884bada.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/5d427f6c-dfa4-4f06-9e9a-6f897d51f953.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/a3501d88-455a-4613-b6f9-9606f2711ec2.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/05a117e3-c7dd-4c0d-ad50-b12220fa53ae.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/a306b31c-d000-459d-b387-b5115309a401.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/2e2a5c3c-1c95-4d40-8d5c-9ff0dca4abb5.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/a9e4aabe-4b61-48cf-b729-7f49a5f140e4.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1beaea66-f9a9-4581-9fdf-4b5e0b5be6c9.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/a0dd76d3-bd0b-4320-b0fd-52929b635995.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/eb8e0f5e-9596-4988-b668-6bfc75ea9809.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/96848b07-ac19-493e-8899-780e3edeee7a.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/ea5ff184-0aad-431c-90d6-6da1091754e7.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/74590d22-ab30-49e1-bdb4-992dad006a4e.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/df0d139b-1307-4e08-8563-a1705b240986.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/8109fa99-7f88-49af-b3e6-7f771d234c38.png) |

![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/work/936e9baf53eb9a217af4f89c616dc19.png)

#### 演示视频

暂无

#### 获取方式

Email: fan1ke2ke@gmail.com

WeChat: `Storm_Berserker`

`附带部署与讲解服务，因为要恰饭资源非免费，伸手党勿扰，谢谢理解😭`

> 1.项目纯原创，不做二手贩子 2.一次购买终身有效 3.项目讲解持续到答辩结束 4.非常负责的答辩指导 5.黑奴价格

> 项目部署调试不好包退！功能逻辑没讲明白包退！

#### 其它资源

[2025年-答辩顺利通过-客户评价🍜](https://berserker287.github.io/2025/06/18/2025%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2024年-答辩顺利通过-客户评价👻](https://berserker287.github.io/2024/06/06/2024%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2023年-答辩顺利通过-客户评价🐢](https://berserker287.github.io/2023/06/14/2023%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2022年-答辩通过率100%-客户评价🐣](https://berserker287.github.io/2022/05/25/%E9%A1%B9%E7%9B%AE%E4%BA%A4%E6%98%93%E8%AE%B0%E5%BD%95/)

[毕业答辩导师提问的高频问题](https://berserker287.github.io/2023/06/13/%E6%AF%95%E4%B8%9A%E7%AD%94%E8%BE%A9%E5%AF%BC%E5%B8%88%E6%8F%90%E9%97%AE%E7%9A%84%E9%AB%98%E9%A2%91%E9%97%AE%E9%A2%98/)

[50个高频答辩问题-技术篇](https://berserker287.github.io/2023/06/13/50%E4%B8%AA%E9%AB%98%E9%A2%91%E7%AD%94%E8%BE%A9%E9%97%AE%E9%A2%98-%E6%8A%80%E6%9C%AF%E7%AF%87/)

[计算机毕设答辩时都会问到哪些问题？](https://www.zhihu.com/question/31020988)

[计算机专业毕业答辩小tips](https://zhuanlan.zhihu.com/p/145911029)

#### 接JAVAWEB毕设，纯原创，价格公道，诚信第一

`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)


`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)
