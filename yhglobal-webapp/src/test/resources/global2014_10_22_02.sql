/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : global

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-10-22 09:55:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_action`
-- ----------------------------
DROP TABLE IF EXISTS `t_action`;
CREATE TABLE `t_action` (
  `action_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_id` varchar(32) default NULL,
  `action_cn_name` varchar(30) NOT NULL,
  `action_en_name` varchar(30) NOT NULL,
  `icon_cls` varchar(30) default NULL,
  `type` enum('Link','Button') default 'Button',
  `disabled` enum('disable','enable') default NULL,
  `method` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(50) default NULL,
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', null);
INSERT INTO `t_action` VALUES ('0257db753ced12815b7831a29f9097bd', '97ff81ae86c2e88f442e98df0ed22046', 'b52fa1566a9e33308bf59b83d5a8f04e', '打印', 'print', 'icon-standard-drive-web', 'Button', 'enable', 'glacier.member_mgr.contract_mgr.contract.printContractorManager();', '1', '');
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.editNews();', '2', null);
INSERT INTO `t_action` VALUES ('11a8ce3bc869f36ddb4274e9016ef6ea', 'fe60a1800397a1c7d62ad980adf7cedb', '708e17657b99ed5a01fdaedba102defd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.carrierCreditworthinessType_mgr.carrierCreditworthinessType_mgr.delCreditwortType();', '3', '');
INSERT INTO `t_action` VALUES ('1270e5991911d7bf38a4ea95df2c44ae', '09bd4101bddc24db837be4479b6be382', '88108c897c8f22c468199b688da39ba9', '启用/禁用', 'audit', 'icon-standard-pencil', 'Button', 'enable', 'glacier.member_mgr.contractManager_mgr.contractManager.editContractorManager();', '4', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', null);
INSERT INTO `t_action` VALUES ('192adad15ca5b03ad223f6469a648c4a', 'fe60a1800397a1c7d62ad980adf7cedb', '708e17657b99ed5a01fdaedba102defd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrierCreditworthinessType_mgr.carrierCreditworthinessType_mgr.editCreditwortType();', '2', '');
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', null);
INSERT INTO `t_action` VALUES ('1a1636c701b7ab4fb82fea88f5896992', '9351ab194a4e54c2f1b3bc6ddf2bdfe4', '7179f4cc8e1af0a1787b2bf4880e4888', '企业认证', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.audit();', '2', '');
INSERT INTO `t_action` VALUES ('1c94d5fcf05f7612da2eef639d7cb8f6', '09bd4101bddc24db837be4479b6be382', '88108c897c8f22c468199b688da39ba9', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.contractManager_mgr.contractManager.updateContractorManager();', '3', '');
INSERT INTO `t_action` VALUES ('1e07f65d9727795f391ee836a46d2f32', '92548feb20b470297cf97b1af39c2512', '7ddf3df3ff79f22dfe87de23b674b086', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.editMemberGrade();', '2', '');
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('2827ffa76ef7391b1e6f01160c7185f8', 'e1a79f5e3fe94e2e8fbe31fd6579ab9b', '0e90f7504fea42f41a94df7ce26da433', '修改', 'edit', 'icon-standard-pencil', 'Button', 'enable', 'glacier.carrier_mgr.carrierRoute_mgr.route.editRoute();', '2', '');
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', null);
INSERT INTO `t_action` VALUES ('2d2de0e230b5f66c14dfe6a33c61d03c', '659b38abc076de53bb0620ba047b8b77', 'e2c8d8b1ff17e4568e3b63e8f103831a', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.member_mgr.bankCard_mgr.bankCard.checkBankCard();', '1', '');
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.editLink();', '2', null);
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', null);
INSERT INTO `t_action` VALUES ('37e1c184f1955d77176643833c588e62', 'e1a79f5e3fe94e2e8fbe31fd6579ab9b', '0e90f7504fea42f41a94df7ce26da433', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierRoute_mgr.route.audit();', '1', '');
INSERT INTO `t_action` VALUES ('40b80f773966a478f8e4abe5122b4551', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.auditCarInfor();', '4', '');
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', null);
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('448027f0b00088365ae93b6fadccc641', '9351ab194a4e54c2f1b3bc6ddf2bdfe4', '7179f4cc8e1af0a1787b2bf4880e4888', '启用/禁用', 'status', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.editMember();', '1', '');
INSERT INTO `t_action` VALUES ('459ea177038dc676461465cd3c016124', '0ad6ee84a7e9678dbb683d8911f1ce97', 'e3cc6780ba67ce00b8320e57cf77a80b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.integralType_mgr.integralType.delIntegralType();', '3', '');
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', null);
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.addService();', '1', null);
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', null);
INSERT INTO `t_action` VALUES ('4e28165aa6dd238bcf136f003cb07916', 'abf160d979050ef082b2b2b53e967618', '77a687db775c4abe87de019b06f2f652', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.packagetypeSet_mgr.packagetypeSet_mgr.packageType.delPackageType();', '3', '');
INSERT INTO `t_action` VALUES ('4e3b12799d739a191cef00f6784ea4af', '4a5f4f4c55665305938981a5f52d86ec', '65abe86e2eff9d8db95b17b323dae0b0', '启用/禁用', 'edit', 'icon-standard-pencil', 'Button', 'enable', 'glacier.storehouse_mgr.storageGoodsrun_mgr.storageGoodsrun.editStorageGoodsrun();', '1', '');
INSERT INTO `t_action` VALUES ('509ddee732c4bfe5debb2e3461ac1d11', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '企业认证', 'auth', 'icon-standard-layout-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.auth();', '3', '');
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', null);
INSERT INTO `t_action` VALUES ('59647b16c8977e332a966a508329a162', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '启用/禁用', 'status', 'icon-standard-pencil', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.editMember();', '1', '');
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.editService();', '2', null);
INSERT INTO `t_action` VALUES ('5b244055f9dcff8dd27222974409b54e', 'd2cb9b9c44425ca4f4bf4dd2c3062371', 'fc1773fcced1a73ea1a36af0a233c684', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.checkCarrierBankCard();', '1', '');
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.delLink();', '3', null);
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', null);
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_action` VALUES ('5ee018901d7be62f5dd04a7557aabf3b', '7c047a722ee223d015fe0b211134feed', 'ce5a5cfd562e1520703f44c4f65720aa', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.storagetypeSet_mgr.storagetypeSet_mgr.storageType.delStorageType();', '3', '');
INSERT INTO `t_action` VALUES ('61ac392752c3ecc16fa034efe45eb7f5', '1da447eee943017b61e8da3c8acdc9ec', 'a958fbe814da1040b304b0a55ad4b87d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.delMemberGrade();', '3', '');
INSERT INTO `t_action` VALUES ('6649c5b917126cf90c8c0ed6655729c5', '9a4d2a8cec977fc35d08a08d1f325a7d', 'f9794dbe00ebc11899a60e0d78831c14', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.editStorageRepair();', '2', '');
INSERT INTO `t_action` VALUES ('664e128429332cb617115ad9f529955f', 'fe60a1800397a1c7d62ad980adf7cedb', '708e17657b99ed5a01fdaedba102defd', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.carrierCreditworthinessType_mgr.carrierCreditworthinessType_mgr.addCreditwortType();', '1', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_action` VALUES ('69a04a83b7cd7880f8699bc6e793826d', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.editMemberGrade();', '2', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', null);
INSERT INTO `t_action` VALUES ('703551fdf50d8d9dbefdb9341506a3d8', '7d7c98a8eb32ff5412d26b3e8ebf1b18', '39c5ecaa9e63b36e48f6eed0fc38f3fb', '打印', 'print', 'icon-standard-script-lightning', 'Button', 'enable', 'glacier.carrier_mgr.carrierContract_mgr.carrierContract.printContractorManager();', '2', '');
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', null);
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.addNews();', '1', null);
INSERT INTO `t_action` VALUES ('781207b537588abfde5e37f67afeebd0', '0ad6ee84a7e9678dbb683d8911f1ce97', 'e3cc6780ba67ce00b8320e57cf77a80b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.integralType_mgr.integralType.addIntegralType();', '1', '');
INSERT INTO `t_action` VALUES ('7dc89e5899608882adb315f4c4653bbb', '9d9cc5684aa7dbf549d481d539fd3fe7', '6bfbd59acf32fcab67d66381277f10b5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.parameterCarrierCarType_mgr.parameterCarrierCarType_mgr.carrierCarType.delCarType();', '3', '');
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', null);
INSERT INTO `t_action` VALUES ('8484e86de965d358d542376368a11aed', 'abf160d979050ef082b2b2b53e967618', '77a687db775c4abe87de019b06f2f652', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.packagetypeSet_mgr.packagetypeSet_mgr.packageType.addPackageType();', '1', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', null);
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8716a2ac3b26e72def12b680fb888a83', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.audit();', '2', '');
INSERT INTO `t_action` VALUES ('87c4521c4b69cb798e302860ce9b769a', '09bd4101bddc24db837be4479b6be382', '88108c897c8f22c468199b688da39ba9', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.contractManager_mgr.contractManager.delContractorManager();', '2', '');
INSERT INTO `t_action` VALUES ('8a2c6502fd24c6192e943305f2ac8b95', '17752f099565a30aa90d48a4f13aa97a', '4f9e05ef61075acbf30cd2d0d75647ca', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.storehouse_mgr.storehouseDamage.storehouseDamage.auditStorehouseDamage();', '1', '');
INSERT INTO `t_action` VALUES ('8bbe0e67c5ce3b94147352ffe36a287d', '92548feb20b470297cf97b1af39c2512', '7ddf3df3ff79f22dfe87de23b674b086', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.delMemberGrade();', '3', '');
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', null);
INSERT INTO `t_action` VALUES ('8d603a7a2fac5f9fa15e6414b085ad03', '9a4d2a8cec977fc35d08a08d1f325a7d', 'f9794dbe00ebc11899a60e0d78831c14', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.delStorageRepair();', '3', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', null);
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', null);
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', null);
INSERT INTO `t_action` VALUES ('9a4fbfdbe97fc3a570a12517984e3b3e', 'e631330cc893bf752a63cb233a3510f4', 'f7680d48de603e1b84c499d3bdfc16bd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.belaidup_mgr.belaidup_mgr.belaidup.editBelaidup();', '2', '');
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', null);
INSERT INTO `t_action` VALUES ('9cc6ac762aa1e31f3d329654b870ae68', '97ff81ae86c2e88f442e98df0ed22046', 'b52fa1566a9e33308bf59b83d5a8f04e', '导出', 'audit', 'icon-standard-script-go', 'Button', 'enable', 'glacier.member_mgr.contract_mgr.contract.editContractorManager();', '1', '');
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', null);
INSERT INTO `t_action` VALUES ('9dd9c70a5ad017f5e72adcf1ed9487ed', '09bd4101bddc24db837be4479b6be382', '88108c897c8f22c468199b688da39ba9', '添加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.contractManager_mgr.contractManager.addContractorManager();', '1', '');
INSERT INTO `t_action` VALUES ('a10e15cd9071d9a070c5ab82f7519807', 'e631330cc893bf752a63cb233a3510f4', 'f7680d48de603e1b84c499d3bdfc16bd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.belaidup_mgr.belaidup_mgr.belaidup.delBelaidup();', '3', '');
INSERT INTO `t_action` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.addLink();', '1', null);
INSERT INTO `t_action` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', null);
INSERT INTO `t_action` VALUES ('a6e710eec213cfb59146530780231330', '7d7c98a8eb32ff5412d26b3e8ebf1b18', '39c5ecaa9e63b36e48f6eed0fc38f3fb', '导出', 'exp', 'icon-standard-script-go', 'Button', 'enable', 'glacier.carrier_mgr.carrierContract_mgr.carrierContract.expContractorManager();', '1', '');
INSERT INTO `t_action` VALUES ('a929d879b049795ce53c4a09e0d3699a', 'e1a79f5e3fe94e2e8fbe31fd6579ab9b', '0e90f7504fea42f41a94df7ce26da433', '启用/禁用', 'status', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrier_mgr.carrierRoute_mgr.route.editRouteStatus();', '3', '');
INSERT INTO `t_action` VALUES ('ab8a1e6580633a4a7d80fa137535d269', '67c5fe81349c08664ac7f5032fbc0934', 'e9bcb940ecc7232664d94eab12c635f5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.storage_mgr.storage_mgr.storage.editStorage();', '2', '');
INSERT INTO `t_action` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', null);
INSERT INTO `t_action` VALUES ('ad54dd7ed4fd5b6bdcbe1c49cb054014', '0ad6ee84a7e9678dbb683d8911f1ce97', 'e3cc6780ba67ce00b8320e57cf77a80b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.integralType_mgr.integralType.editIntegralType();', '2', '');
INSERT INTO `t_action` VALUES ('aea05b557aceb2e1dfd5633aeab6e2e0', '9d9cc5684aa7dbf549d481d539fd3fe7', '6bfbd59acf32fcab67d66381277f10b5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.parameterCarrierCarType_mgr.parameterCarrierCarType_mgr.carrierCarType.editCarType();', '2', '');
INSERT INTO `t_action` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.delNews();', '3', null);
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', null);
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.delService();', '3', null);
INSERT INTO `t_action` VALUES ('c0d69303ffda384772d3029472ad1eda', 'e631330cc893bf752a63cb233a3510f4', 'f7680d48de603e1b84c499d3bdfc16bd', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.belaidup_mgr.belaidup_mgr.belaidup.addBelaidup();', '1', '');
INSERT INTO `t_action` VALUES ('c15b32739577440121ea628b8bc57116', 'abf160d979050ef082b2b2b53e967618', '77a687db775c4abe87de019b06f2f652', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.packagetypeSet_mgr.packagetypeSet_mgr.packageType.editPackageType();', '2', '');
INSERT INTO `t_action` VALUES ('c4d648fe510a6bb70284ee8dd9e0c5a5', '9c3c21783355119015ea6eff24d6773a', 'ed1135b4ad81bce24966571e4f3f9e15', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.goodstypeSet_mgr.goodstypeSet_mgr.goodsType.addGoodsType();', '1', '');
INSERT INTO `t_action` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', null);
INSERT INTO `t_action` VALUES ('c9bdacf782b0cf69444195318ce49676', '1da447eee943017b61e8da3c8acdc9ec', 'a958fbe814da1040b304b0a55ad4b87d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.addMemberGrade();', '1', '');
INSERT INTO `t_action` VALUES ('cb2f01aeff2ab9555624a6fc98b4fc14', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.addMemberGrade();', '1', '');
INSERT INTO `t_action` VALUES ('cd0d43fb1ac61a343274629a957db030', '67c5fe81349c08664ac7f5032fbc0934', 'e9bcb940ecc7232664d94eab12c635f5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.storage_mgr.storage_mgr.storage.delStorage();', '3', '');
INSERT INTO `t_action` VALUES ('ce765b2768b6437f5ba5ac25c75556d4', '67c5fe81349c08664ac7f5032fbc0934', 'e9bcb940ecc7232664d94eab12c635f5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.storage_mgr.storage_mgr.storage.addStorage();', '1', '');
INSERT INTO `t_action` VALUES ('cff67a54c85be3f723a54bc95552f053', '1da447eee943017b61e8da3c8acdc9ec', 'a958fbe814da1040b304b0a55ad4b87d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.editMemberGrade();', '2', '');
INSERT INTO `t_action` VALUES ('d708b20601984409ea248f10887c7014', '7c047a722ee223d015fe0b211134feed', 'ce5a5cfd562e1520703f44c4f65720aa', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.storagetypeSet_mgr.storagetypeSet_mgr.storageType.editStorageType();', '2', '');
INSERT INTO `t_action` VALUES ('d7d3c343b06e8ea0aa51e8bfbef45e90', '9d9cc5684aa7dbf549d481d539fd3fe7', '6bfbd59acf32fcab67d66381277f10b5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.parameterCarrierCarType_mgr.parameterCarrierCarType_mgr.carrierCarType.addCarType();', '1', '');
INSERT INTO `t_action` VALUES ('d907cffb18814664eaf19095d02fe04e', '7c047a722ee223d015fe0b211134feed', 'ce5a5cfd562e1520703f44c4f65720aa', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.storagetypeSet_mgr.storagetypeSet_mgr.storageType.addStorageType();', '1', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', null);
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', null);
INSERT INTO `t_action` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', null);
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', null);
INSERT INTO `t_action` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', null);
INSERT INTO `t_action` VALUES ('e637e0b745853ed1741fd78e4473cfa4', '92548feb20b470297cf97b1af39c2512', '7ddf3df3ff79f22dfe87de23b674b086', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.addMemberGrade();', '1', '');
INSERT INTO `t_action` VALUES ('f2f20c59914cc38e0373e2348ba0b78e', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.delMemberGrade();', '3', '');
INSERT INTO `t_action` VALUES ('f3be14d21993406f00ae4e1c91d6ab2e', '9c3c21783355119015ea6eff24d6773a', 'ed1135b4ad81bce24966571e4f3f9e15', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.goodstypeSet_mgr.goodstypeSet_mgr.goodsType.editGoodsType();', '2', '');
INSERT INTO `t_action` VALUES ('f3e55f82a10d8bae1170889a002b1359', '9a4d2a8cec977fc35d08a08d1f325a7d', 'f9794dbe00ebc11899a60e0d78831c14', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.addStorageRepair();', '1', '');
INSERT INTO `t_action` VALUES ('f42891ae5589ad2ae15b87eb0e50b784', '9c3c21783355119015ea6eff24d6773a', 'ed1135b4ad81bce24966571e4f3f9e15', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.goodstypeSet_mgr.goodstypeSet_mgr.goodsType.delGoodsType();', '3', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', null);
INSERT INTO `t_action` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', null);
INSERT INTO `t_action` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', null);
INSERT INTO `t_action` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

-- ----------------------------
-- Table structure for `t_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority` (
  `role_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  `actions` varchar(21779) default NULL,
  PRIMARY KEY  (`role_id`,`menu_id`),
  KEY `FK_t_authority2` (`menu_id`),
  CONSTRAINT `FK_auth_menu_menu_id` FOREIGN KEY (`menu_id`) REFERENCES `t_menu` (`menu_id`),
  CONSTRAINT `FK_auth_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '88ee044d59911b3b1a67ba4cdd0ee90d', 'AnnouncementList_add,AnnouncementList_edit,AnnouncementList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '91ca1b4b197688f21b68a72f69e09a8d', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'ac892df07f9087fb1c89ac968bb5f555', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e42b98561176563f930d82c80b041ed8', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e550884c5e6c1e94ee70cc833aa1c2b9', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'fefe8e9ee335dadbace082923415e023', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '09bd4101bddc24db837be4479b6be382', 'ContractManagerList_add,ContractManagerList_del,ContractManagerList_edit,ContractManagerList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0ad6ee84a7e9678dbb683d8911f1ce97', 'IntegralTypeList_add,IntegralTypeList_edit,IntegralTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0d6ca38f1d454978003bc83312a92266', 'carrierCarInformationList_add,carrierCarInformationList_edit,carrierCarInformationList_del,carrierCarInformationList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '17752f099565a30aa90d48a4f13aa97a', 'StorehouseDamageList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '1da447eee943017b61e8da3c8acdc9ec', 'CarrierMemberGradList_add,CarrierMemberGradList_edit,CarrierMemberGradList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4a5f4f4c55665305938981a5f52d86ec', 'StorageGoodsrunList_edit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit,NavTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5185a2c89ccdd63fa82ab7804be04b27', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '659b38abc076de53bb0620ba047b8b77', 'BankCardList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '67c5fe81349c08664ac7f5032fbc0934', 'StorageList_add,StorageList_edit,StorageList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '7c047a722ee223d015fe0b211134feed', 'StorageTypeList_add,StorageTypeList_edit,StorageTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '7d7c98a8eb32ff5412d26b3e8ebf1b18', 'CarrierContractList_exp,CarrierContractList_print');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '88ee044d59911b3b1a67ba4cdd0ee90d', 'AnnouncementList_add,AnnouncementList_edit,AnnouncementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '92548feb20b470297cf97b1af39c2512', 'MemberGradList_add,MemberGradList_edit,MemberGradList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9351ab194a4e54c2f1b3bc6ddf2bdfe4', 'MemberList_status,MemberList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '97ff81ae86c2e88f442e98df0ed22046', 'ContractList_print,ContractList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9a4d2a8cec977fc35d08a08d1f325a7d', 'StorageRepairList_add,StorageRepairList_edit,StorageRepairList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9c3c21783355119015ea6eff24d6773a', 'GoodsTypeList_add,GoodsTypeList_edit,GoodsTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9c98de170d8569d8b39d656fa1e788ac', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9d9cc5684aa7dbf549d481d539fd3fe7', 'CarrierCartypeList_add,CarrierCartypeList_edit,CarrierCartypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9f8578449c1035b20c35fbf1fcc72951', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a4144902eb68672fb147ef21d9470062', 'carrierMemberList_status,carrierMemberList_audit,carrierMemberList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'abf160d979050ef082b2b2b53e967618', 'PackageTypeList_add,PackageTypeList_edit,PackageTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'cdf113348c5899a193a0edb40252fd7e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd2cb9b9c44425ca4f4bf4dd2c3062371', 'CarrierBankCardList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e1a79f5e3fe94e2e8fbe31fd6579ab9b', 'routeList_audit,routeList_edit,routeList_status');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e631330cc893bf752a63cb233a3510f4', 'BelaidupList_add,BelaidupList_edit,BelaidupList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fe60a1800397a1c7d62ad980adf7cedb', 'CreditworthinessTypeList_add,CreditworthinessTypeList_edit,CreditworthinessTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fefe8e9ee335dadbace082923415e023', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');

-- ----------------------------
-- Table structure for `t_carrierlogin_action`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_action`;
CREATE TABLE `t_carrierlogin_action` (
  `action_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_id` varchar(32) default NULL,
  `action_cn_name` varchar(30) NOT NULL,
  `action_en_name` varchar(30) NOT NULL,
  `icon_cls` varchar(30) default NULL,
  `type` enum('Link','Button') default 'Button',
  `disabled` enum('disable','enable') default NULL,
  `method` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_action
-- ----------------------------
INSERT INTO `t_carrierlogin_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', null);
INSERT INTO `t_carrierlogin_action` VALUES ('11a8ce3bc869f36ddb4274e9016ef6ea', 'fe60a1800397a1c7d62ad980adf7cedb', '708e17657b99ed5a01fdaedba102defd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.carrierCreditworthinessType_mgr.carrierCreditworthinessType_mgr.delCreditwortType();', '3', '');
INSERT INTO `t_carrierlogin_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('192adad15ca5b03ad223f6469a648c4a', 'fe60a1800397a1c7d62ad980adf7cedb', '708e17657b99ed5a01fdaedba102defd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrierCreditworthinessType_mgr.carrierCreditworthinessType_mgr.editCreditwortType();', '2', '');
INSERT INTO `t_carrierlogin_action` VALUES ('40b80f773966a478f8e4abe5122b4551', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.auditCarInfor();', '4', '');
INSERT INTO `t_carrierlogin_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', null);
INSERT INTO `t_carrierlogin_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('509ddee732c4bfe5debb2e3461ac1d11', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '企业认证', 'auth', 'icon-standard-layout-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.auth();', '3', '');
INSERT INTO `t_carrierlogin_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_carrierlogin_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('59647b16c8977e332a966a508329a162', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '启用/禁用', 'status', 'icon-standard-pencil', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.editMember();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('5b244055f9dcff8dd27222974409b54e', 'd2cb9b9c44425ca4f4bf4dd2c3062371', 'fc1773fcced1a73ea1a36af0a233c684', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.checkCarrierBankCard();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('61ac392752c3ecc16fa034efe45eb7f5', '1da447eee943017b61e8da3c8acdc9ec', 'a958fbe814da1040b304b0a55ad4b87d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.delMemberGrade();', '3', '');
INSERT INTO `t_carrierlogin_action` VALUES ('664e128429332cb617115ad9f529955f', 'fe60a1800397a1c7d62ad980adf7cedb', '708e17657b99ed5a01fdaedba102defd', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.carrierCreditworthinessType_mgr.carrierCreditworthinessType_mgr.addCreditwortType();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('69a04a83b7cd7880f8699bc6e793826d', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.editMemberGrade();', '2', '');
INSERT INTO `t_carrierlogin_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('7dc89e5899608882adb315f4c4653bbb', '9d9cc5684aa7dbf549d481d539fd3fe7', '6bfbd59acf32fcab67d66381277f10b5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.parameterCarrierCarType_mgr.parameterCarrierCarType_mgr.carrierCarType.delCarType();', '3', '');
INSERT INTO `t_carrierlogin_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_carrierlogin_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('8716a2ac3b26e72def12b680fb888a83', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '审核', 'audit', 'icon-standard-application-edit', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.audit();', '2', '');
INSERT INTO `t_carrierlogin_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', null);
INSERT INTO `t_carrierlogin_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('9de6d4dd57afd65f062908cb72e04e32', 'a4144902eb68672fb147ef21d9470062', '6b20ba67a120ba1fcaa5283c8c950f6d', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'enable', 'glacier.carrier_mgr.carrierMember_mgr.member.roleAssign();', '4', '');
INSERT INTO `t_carrierlogin_action` VALUES ('a6e710eec213cfb59146530780231330', '7d7c98a8eb32ff5412d26b3e8ebf1b18', '39c5ecaa9e63b36e48f6eed0fc38f3fb', '导出', 'exp', 'icon-standard-script-go', 'Button', 'enable', 'glacier.carrier_mgr.carrierContract_mgr.carrierContract.expContractorManager();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('aea05b557aceb2e1dfd5633aeab6e2e0', '9d9cc5684aa7dbf549d481d539fd3fe7', '6bfbd59acf32fcab67d66381277f10b5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.parameterCarrierCarType_mgr.parameterCarrierCarType_mgr.carrierCarType.editCarType();', '2', '');
INSERT INTO `t_carrierlogin_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', null);
INSERT INTO `t_carrierlogin_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_carrierlogin_action` VALUES ('c9bdacf782b0cf69444195318ce49676', '1da447eee943017b61e8da3c8acdc9ec', 'a958fbe814da1040b304b0a55ad4b87d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.addMemberGrade();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('cb2f01aeff2ab9555624a6fc98b4fc14', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.addMemberGrade();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('cff67a54c85be3f723a54bc95552f053', '1da447eee943017b61e8da3c8acdc9ec', 'a958fbe814da1040b304b0a55ad4b87d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.editMemberGrade();', '2', '');
INSERT INTO `t_carrierlogin_action` VALUES ('d7d3c343b06e8ea0aa51e8bfbef45e90', '9d9cc5684aa7dbf549d481d539fd3fe7', '6bfbd59acf32fcab67d66381277f10b5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.parameterCarrierCarType_mgr.parameterCarrierCarType_mgr.carrierCarType.addCarType();', '1', '');
INSERT INTO `t_carrierlogin_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', null);
INSERT INTO `t_carrierlogin_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', null);
INSERT INTO `t_carrierlogin_action` VALUES ('f2f20c59914cc38e0373e2348ba0b78e', '0d6ca38f1d454978003bc83312a92266', 'b641fe58b8f9d34c77f557159beaca5f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.delMemberGrade();', '3', '');
INSERT INTO `t_carrierlogin_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', null);

-- ----------------------------
-- Table structure for `t_carrierlogin_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_authority`;
CREATE TABLE `t_carrierlogin_authority` (
  `role_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  `actions` varchar(21779) default NULL,
  PRIMARY KEY  (`role_id`,`menu_id`),
  KEY `FK_t_authority2` (`menu_id`),
  CONSTRAINT `t_carrierlogin_authority_ibfk_1` FOREIGN KEY (`menu_id`) REFERENCES `t_carrierlogin_menu` (`menu_id`),
  CONSTRAINT `t_carrierlogin_authority_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `t_carrierlogin_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_authority
-- ----------------------------
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0d6ca38f1d454978003bc83312a92266', 'carrierCarInformationList_add,carrierCarInformationList_edit,carrierCarInformationList_del,carrierCarInformationList_audit');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '1da447eee943017b61e8da3c8acdc9ec', 'CarrierMemberGradList_add,CarrierMemberGradList_edit,CarrierMemberGradList_del');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5185a2c89ccdd63fa82ab7804be04b27', null);
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '7d7c98a8eb32ff5412d26b3e8ebf1b18', 'CarrierContractList_exp');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9d9cc5684aa7dbf549d481d539fd3fe7', 'CarrierCartypeList_add,CarrierCartypeList_edit,CarrierCartypeList_del');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9f8578449c1035b20c35fbf1fcc72951', null);
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a4144902eb68672fb147ef21d9470062', 'carrierMemberList_status,carrierMemberList_audit,carrierMemberList_auth,carrierMemberList_assign');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd2cb9b9c44425ca4f4bf4dd2c3062371', 'CarrierBankCardList_audit');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fe60a1800397a1c7d62ad980adf7cedb', 'CreditworthinessTypeList_add,CreditworthinessTypeList_edit,CreditworthinessTypeList_del');
INSERT INTO `t_carrierlogin_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');

-- ----------------------------
-- Table structure for `t_carrierlogin_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_loginlog`;
CREATE TABLE `t_carrierlogin_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL,
  `login_user` varchar(32) default NULL,
  `login_time` datetime default NULL,
  `login_ip` varchar(50) default NULL,
  `browser_version` varchar(50) default NULL,
  `screen_size` varchar(50) default NULL,
  PRIMARY KEY  (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `t_carrierlogin_loginlog_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_carrierlogin_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_loginlog
-- ----------------------------
INSERT INTO `t_carrierlogin_loginlog` VALUES ('016d4464d3b00a22ceeb61a22e9c6287', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 14:49:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('023a60747478f3b0cb3db5f08f7e3596', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 16:37:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('04f6ddc9a4afc3d7afc135f4e701eb75', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 03:54:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('08bb4ea239a2312156273a3ebcf1129c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 16:38:21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('08cb6d64b35a8af4e7497534bcdae971', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-15 16:00:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('0b299f626cc6c0a5822537946894826d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:23:42', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('0c7f6659e429787583f3b5cde9dec76d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 16:19:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('0e18a6a69ab90ad529b5d12d48fdad1c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 17:57:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('0e69cc184705e9d463ab4e032622a44c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 00:45:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('0e87c9b6f99f459def18b59d057b1903', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 14:21:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('0fcdf496387fd419a17b1fc820f7f7eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 01:49:42', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('108e5bddb23effcfa69ff60e07b48e6b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:09:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('10ccbe6fad573ee46c79a61bff489373', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 14:39:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('13dc5c645a7708b0a56f7053cc36b89d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:05:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('14cb52a8414fd4e1dc776af4f82206ce', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:38:51', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('1e1eea41336f7624e163b62a7dc55cc6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 04:27:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('1e8d66778715c163e6e7e287454830a6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-15 15:49:51', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('2145647f38fce5db55f9750ae6e7de3e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:44:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('2175b090815921aa4b9b80ff3e214259', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:24:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('21862196a49c827ff9408a0d90b29cf3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:49:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('2187bc3b00b48bb7d46b88eb968627e6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 14:25:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('222c9be0323b51243b0662c34a1aae5f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:45:13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('2247fb6420e28baa10156a53bab8c76a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:23:24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('24c715d868f08c1ac89236625fd72914', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 16:37:36', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('252b8c540b5a6944306c99fca8a1480c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:54:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('266da6b0ec1026bea41a02ef9e24ceb3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:53:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('2762c288a9cef0807bd42a7334c34e46', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:24:23', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('28cee37c704d8b52631c8faaa1407df5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 14:39:24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('2fa9503ad9927000ee1fe0ee34655d50', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:04:05', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('320b8eecdcb65f354bb8757528fbbf45', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:32:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('33ece6518e1f983f81fe1bf034daf2f6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:10:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('34fbf16bd654a4f262576b4f16e5e8f4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 16:37:31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('352ffae660b836a2e07153ba2eccf351', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:37:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('36d1f1a7432e22009987edb77c67b2c3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 04:08:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('36d1feffaf9954272035c0a3cdf3c7d8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:47:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('38ec52c7781e1379a4292b37a9f1df65', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:07:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('3cb59fce4c6444d535f406d178431185', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:55:07', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('411708eb4b7f8bb2b27240ea89c80521', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:22:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('428c54747ce62fcc5b39995ebb36db4b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:47:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('42d2740dbe7a52458239cc813b348ced', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 13:48:28', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('4b02fd0a6457da7a9e1375a9b7dccd22', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 16:27:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('4f4e8d6649d6396ca554257e7cc66760', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 13:28:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('4f95d2245c8786c19dc959255a7b0b4e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:21:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('51bc8418f5f9a6ae9f7368985a0f9459', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 00:11:37', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('5231db149c1f1bfac137ce393e3c676c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 16:49:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('549a8d88a0b4d26fdeea9c1523d91cb8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 15:08:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('557da535e776dbbd9ee3c62b2d25ed9c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:16:52', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('563e04852710b6f393e2bcdbb9f0b562', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:46:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('57c841d1eb4bab314ec15ea00f797dce', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:25:44', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('57ef9370de9e2584aafb6614df72ea6d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 15:02:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('58139e48fdcd5d0db9ca3a3fb0d511b1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:14:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('59aa609ed4408782f33f51b38326bcbc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 21:12:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('59ee6e49495cec0db2488361fe8526b7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 13:23:12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('5d9f3b7548c533ac04dc574e869bc0aa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 08:38:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('62d20683c935d3120dae5aed8a0c9e1d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:41:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('63d5d7855d8d53cedfd933a2ff6dca2b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:16:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('66860726e895e2f69e16cbcd8dd5c7cb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 17:04:36', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('6720d06e139cdeedd1bb1b17a5836507', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 18:03:25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('6a01119741962e3d718eb541330d6e3e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 16:31:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('6b9cb2d309e1bf5d2becf0a2f2e67203', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 17:54:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('6e26891264ff24e9c1992fe1bef81a59', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:12:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('6f74dfb6223128b4212b14e01ce4d1af', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 10:37:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('70e1cd3ee3d60f66c77e436df9dd1b27', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 16:33:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('71a727597b99fb6f1b991e21b730d50f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:11:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('73c2823edc2885f5a542e90fa499b4a1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 16:58:23', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('754d5b4ccafb646e94afa9616c713294', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 17:04:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('76b3208d00dc72ab5767853222a62e47', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 17:56:00', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('76d498ad6a9e4c0928fd09da4f8bf61a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 13:17:32', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('77961dbd39e9bccd377c5b6ffef86f1e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 16:51:31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('779df8a775fdfdae59434bbfee55183d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:25:03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('7bf7380d97c559d917f618b97a833d82', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:51:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('7fd5cd0358eb10da7ff9cc8b86234597', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 14:10:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('80d6ba5fbcce6c9d45da22f2038f82c9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 03:56:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('820c0f394328d888bf0e9e57da808e8f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 16:07:26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('8330bf803a77bdb7d3c4f7bcf844e8e2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:21:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('85f76eb1f5a57abc5df72854964e3d95', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:35:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('88a07dd2b677de6c979b094e90dd2689', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:45:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('8ceff62c4145822b5d26183a160df84e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 08:57:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('8eac8b721fe7dd2daf6ce521c5e185f5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:27:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('9096a1ed549918ef209d3c8fa8ef17d9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 00:21:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('9298982404ec019e24665d35752f9550', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:32:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('92ebf0d35d7296f79e0caf9994354198', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:27:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('9458b655a2d1bd5e7aa82ee9aba5011a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:24:13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('958870644bc613f17e8df49fb330bba0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:29:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('974ad5ff0f8423854c9143b184dc9c1b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:22:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('980f870aecb12ab9f1b9123ea23b5074', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:51:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('9ae32b20fa12ca1d4d34fb511930a65e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:11:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('9c18ef6a9b9bea821455a49a400c1194', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 13:50:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a2a8fd43d9b8d86e312f0a0f11beb591', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 13:22:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a39d582f8ba9c2b701505b187430340d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:30:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a56d7b5baf7df1cdde76f4f5368328d5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 13:50:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a58ad5b4b5d647132cc9ef2c84a3d0fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 13:17:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a6fb000486229464ed4631850525e8c3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 11:18:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a6ff065493e64bd4a393ab198bc33dd6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 05:14:58', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('a90b05849ee1bb4606efaed475a88296', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:21:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ac7769b5dee3ad75fa8e18979cdd9337', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 17:09:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b05021fc79bcf12485b54a18196d9b72', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 17:26:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b0c8c27ff3ec0477bdd71a90ba0e5684', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:57:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b24ac4542712018a1f52c8c66ad2b015', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 17:37:13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b291c8fc8bf06e5e71f6e8f4586dd349', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:32:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b2be0339920c323abdaf9e785f48a81a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 13:44:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b3e2042a42ff8f113a5a1a2ecd52d15c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 13:45:31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b54f4857bad7483ad0e023503ab717f4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-15 15:55:47', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('b9d7dfb2a4acddc08a0bf13e15142501', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 14:22:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ba7ae3dd10903533070addb6ac8be2a4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 13:27:15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('bccada78aa9c99b41007595d4b6a2ea9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 13:57:12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('be3dc276ec9569cd5445470feee7f508', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 16:58:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('bf8d8dd25686031857175a93cad762c7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 10:22:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('c00a05a32c78de905a1890631336a7fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:27:15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('c0ee423a572aa93a1aeae65ff71bdcf6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 09:40:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('c1d8926bcb9c2d291acbb8354d72464a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:58:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('c2d6bd1dc7e16f1fb2c96ce421ea4a04', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:30:12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('c5d8e6f78089e5f613d11f594b0accf3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:08:29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('c6383503aff9985a9ff4bcfcbad5e1eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:26:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('cb8a0bcd35656ad6ab22776b7522d3bd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 22:45:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ce2ff7ebc8735a08c05983dd77f3f350', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 12:34:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('cf5523657d417fce7bed0f1ec04038dd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:39:32', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d0162fe3067df9ebfaca8df42d5c3b4e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 13:21:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d073501222c0e089a7f7e090502efdd8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 00:42:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d0a4f3602bfe2d648edb1780791aed19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 15:17:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d2e69b69cd36cc600b75b51590a3a76f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 13:26:44', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d30294e9f1d0fdaf9d05d5994146fd21', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:04:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d4d027de71ff2c2f4ddce79adb8ed928', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 08:46:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d4f47d7132d7686db79fbf3449d07589', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 16:32:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d6798c63fe33f6982e6d4b2760acf144', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 15:14:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d77f6832bd6f7eb385b0d0829edefa31', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:22:45', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d8613c98c7457e6cc50bcdf6fa150120', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 01:45:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d95b0193726486c0145e6c7adef9d4bc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 15:06:25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('d9e7869f28d5d8beb2610682e39f5402', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:24:58', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('dae1ae77c0ada5bedd778d2966552d99', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 22:56:15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('db1a76fa27e6f180bcbbbfac21a598b2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:17:38', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('dc6b29a8ec48dbc830dfb1fecdb43cc7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:50:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('dea43111fa4215c6d11ca52402388cb4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:50:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('dfceaecd405c6d2ad6019771a48503d9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:13:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e1079ada92f4b8ac2bbef1b318400389', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 05:38:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e202424e1ff386e696bb8241d0bff037', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 14:55:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e21cd6871b2e781d8d3b8896d444a744', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:39:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e3d60f81c0645e25edd1a6372066a7f9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 13:30:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e539c345040ac85df1a64c20797b8be9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 14:10:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e65b2c31c8cf8fe35a568aed5f95fb59', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:58:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e6b53eb5f2bb0bc8853c0b96c4b30fb3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 22:06:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e803e010a873f301754fee87a8f4a05f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 17:51:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('e81c7dbd627c6f9ae049f9c13473c0a5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 21:19:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('eb9c385b946a1b96e8d02f663c060e67', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 10:12:51', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ec330abfd9837add3645137bdfcabf6d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:27:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ec50896d087c384a38137b78e9a15882', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 16:31:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ed3f1096cbb833ce56dc4715145194e9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 13:33:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ef1e35af8ffd324293fa3787b6084531', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 13:58:29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f017be97f1cc08e161988781f9c2eb20', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:38:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f2b1196bb43b83fd671ac4b3fba1aa54', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 16:48:03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f4670d4b573c94b5b8082a2020093b8f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 13:19:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f49367c9e8796f8e5d21b246fa1df014', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:09:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f5a673d9fd243c30019b906bedef423f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:33:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f5ae365a52901308293eac1f5a95faee', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 13:23:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f5b670bd2d07dfdb78a2990394ca72f4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 04:05:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f9919aaedde3a805549ad28be0257a64', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 13:59:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('f9cabdfb60fa1c6d11535fa080299510', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 13:36:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('faab57afced701c66fde52d6fc6cf962', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 00:05:21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('fdf0e90d5992bb953ab5422b8d08c67b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:23:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('feafdc64b94fee76bf79ed8ca5b6ee61', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:09:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('feddf3c972982af08e076a36bbf9d6e4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:25:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_carrierlogin_loginlog` VALUES ('ff45a71c0471614db0376f0d2bc9668f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 13:29:44', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_carrierlogin_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_menu`;
CREATE TABLE `t_carrierlogin_menu` (
  `menu_id` varchar(32) NOT NULL,
  `pid` varchar(32) default NULL,
  `menu_en_name` varchar(30) default NULL,
  `menu_cn_name` varchar(30) default NULL,
  `icon_cls` varchar(50) default NULL,
  `url` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`menu_id`),
  KEY `FK_menu2parent1N` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_menu
-- ----------------------------
INSERT INTO `t_carrierlogin_menu` VALUES ('0d6ca38f1d454978003bc83312a92266', '9f8578449c1035b20c35fbf1fcc72951', 'carrierCarInformation', '承运商车辆信息', 'icon-standard-car', '/do/carrierCarInformation/index.htm', '2', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('1da447eee943017b61e8da3c8acdc9ec', '9f8578449c1035b20c35fbf1fcc72951', 'carrierMemberGrade', '承运商信誉等级', 'icon-standard-award-star-gold-1', '/do/carrierMemberGrade/index.htm', '3', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('5185a2c89ccdd63fa82ab7804be04b27', '9f8578449c1035b20c35fbf1fcc72951', 'creditwortiness', '信誉记录', 'icon-standard-award-star-bronze-3', '/do/memberCreditwortiness/index.htm', '6', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '3', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('7d7c98a8eb32ff5412d26b3e8ebf1b18', '9f8578449c1035b20c35fbf1fcc72951', 'carrierContract', '承运商合同记录', 'icon-standard-table-multiple', '/do/carrierContract/index.htm', '4', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('9d9cc5684aa7dbf549d481d539fd3fe7', '14sdf54157cf483a790f4eea35dsf6f6', 'carrierCartype', '车辆类型管理', 'icon-standard-application-link', '/do/carrierCarType/index.htm', '4', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('9f8578449c1035b20c35fbf1fcc72951', null, '', '承运商管理', 'icon-standard-car', '', '4', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('a4144902eb68672fb147ef21d9470062', '9f8578449c1035b20c35fbf1fcc72951', 'carrierMember', '承运商信息', 'icon-hamburg-suppliers', '/do/carrierMember/index.htm', '1', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('d2cb9b9c44425ca4f4bf4dd2c3062371', '9f8578449c1035b20c35fbf1fcc72951', 'carrierBankCard', '承运商银行卡信息', 'icon-standard-money-yen', '/do/carrierBankCard/index.htm', '5', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '2', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('fe60a1800397a1c7d62ad980adf7cedb', '14sdf54157cf483a790f4eea35dsf6f6', 'creditworthinessType', '信誉度类型管理', 'icon-hamburg-featured', '/do/creditworthinessType/index.htm', '10', '');
INSERT INTO `t_carrierlogin_menu` VALUES ('sdsfeg4157cf483a790f4eea35ds5675', '14sdf54157cf483a790f4eea35dsf6f6', 'optgroup', '下拉项管理', 'icon-hamburg-sitemap', '/do/optgroup/index.htm', '2', '');

-- ----------------------------
-- Table structure for `t_carrierlogin_operalog`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_operalog`;
CREATE TABLE `t_carrierlogin_operalog` (
  `operalog_id` varchar(32) NOT NULL COMMENT '主键',
  `opera_menu` varchar(255) default NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) default NULL COMMENT '操作面板',
  `opera_method` varchar(255) default NULL COMMENT '操作方法',
  `opera_result` varchar(255) default NULL COMMENT '操作结果',
  `opera_desc` varchar(1000) default NULL COMMENT '返回内容',
  `opera_class` varchar(255) default NULL COMMENT '调用类',
  `opera_md` varchar(255) default NULL COMMENT '调用方法',
  `opera_key` varchar(255) default NULL COMMENT '操作KEY',
  `operator` varchar(32) default NULL COMMENT '操作人',
  `opera_time` datetime default NULL COMMENT '操作世间',
  PRIMARY KEY  (`operalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_operalog
-- ----------------------------
INSERT INTO `t_carrierlogin_operalog` VALUES ('0133c91c94aeb287f579256eeeb0fc9a', '下拉项管理', '下拉列表', '修改', '1', '[返程车] 下拉项值信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-10-13 09:00:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('02e2aac3fcfe9c90027af8c2a4af13cc', '下拉项管理', '下拉列表', '增加', '1', '[登录] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-10 11:29:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('07d3d90068a6601040bded5b9a0a6e0f', '资源管理', '菜单树', '修改', '1', '[会银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:49:12');
INSERT INTO `t_carrierlogin_operalog` VALUES ('07ede96e4f9e8cdcb213d470934ec7dc', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 21:19:35');
INSERT INTO `t_carrierlogin_operalog` VALUES ('098ec46bfa8370b650d47574b675e24b', '资源管理', '操作列表', '增加', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:39:29');
INSERT INTO `t_carrierlogin_operalog` VALUES ('0ba02030b86114eb53d5200fb8fad6f3', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-11 09:43:07');
INSERT INTO `t_carrierlogin_operalog` VALUES ('0e246455e39a74397ae968f5f62c0911', '下拉项管理', '下拉列表', '增加', '1', '[整车] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 08:53:38');
INSERT INTO `t_carrierlogin_operalog` VALUES ('0e2e4492eb869b4ec88ea6202dd8c804', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:53');
INSERT INTO `t_carrierlogin_operalog` VALUES ('0f3e3931d5fa18f3d63a36c813f041f4', '资源管理', '菜单树', '修改', '1', '[积分类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 11:17:54');
INSERT INTO `t_carrierlogin_operalog` VALUES ('0fc95e3d46882d2d2ea7b49b62b5ebc5', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:58');
INSERT INTO `t_carrierlogin_operalog` VALUES ('103f6fccf7d016ce0f084a13c943967f', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 02:56:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('10a371d25f18220804f4b11d6a6da316', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 00:29:19');
INSERT INTO `t_carrierlogin_operalog` VALUES ('123e88eaae91cbe41eb2c4fc2b17a659', '资源管理', '面板列表', '增加', '1', '[会员银行卡列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-09 17:45:37');
INSERT INTO `t_carrierlogin_operalog` VALUES ('12c01e3ef088cb85e506bb797e50fa82', '资源管理', '菜单树', '修改', '1', '[货主会员信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 11:18:00');
INSERT INTO `t_carrierlogin_operalog` VALUES ('16d9d16ba39f9e1bde714dfe11d73a7b', '下拉项管理', '下拉项树', '增加', '1', '[积分类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-10 11:29:03');
INSERT INTO `t_carrierlogin_operalog` VALUES ('17cce2f3fb20546964b82e7908643d07', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:08:48');
INSERT INTO `t_carrierlogin_operalog` VALUES ('191615b007c40d57a50dcae925999729', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 08:46:31');
INSERT INTO `t_carrierlogin_operalog` VALUES ('1b21ef30dec0cc87cbb560f5033f8a4a', '资源管理', '面板列表', '增加', '1', '[承运商合同列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-12 23:56:37');
INSERT INTO `t_carrierlogin_operalog` VALUES ('1c97fc76666299189b44901eefdd397e', '资源管理', '操作列表', '增加', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 18:02:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('1d019dc65ca2e7f86f960f4ad5da3c36', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:03');
INSERT INTO `t_carrierlogin_operalog` VALUES ('1fec8f6b4d0a0afe4214c14212d95e42', '资源管理', '菜单树', '修改', '1', '[承运商信誉等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:22');
INSERT INTO `t_carrierlogin_operalog` VALUES ('20bf6c6de71988f7efc153c588def3ac', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:29:07');
INSERT INTO `t_carrierlogin_operalog` VALUES ('20d32a1d7aa2a4c615f8a2042b65f722', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:39:40');
INSERT INTO `t_carrierlogin_operalog` VALUES ('218453d9652bd2a77a56acdb5a552689', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 13:38:42');
INSERT INTO `t_carrierlogin_operalog` VALUES ('22b706a31f77a86b313f54bad1b76ec2', '下拉项管理', '下拉列表', '增加', '1', '[零装] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 08:53:56');
INSERT INTO `t_carrierlogin_operalog` VALUES ('22f194326d9f264b131f6a5097a165c2', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 13:44:28');
INSERT INTO `t_carrierlogin_operalog` VALUES ('24965731cbc51837fa51722f187a533f', '下拉项管理', '下拉项树', '修改', '1', '[运送类型] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:55:02');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2564a5743fd8331442554a7ed736ba7f', '资源管理', '面板列表', '增加', '1', '[仓库类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-15 15:52:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('271477e58a7174bfacfe4bcd926f66c3', '下拉项管理', '下拉项树', '修改', '1', '[承运商车辆信息] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:54:48');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2715925966d6dcb5c04b0fd7557b5bff', '资源管理', '操作列表', '增加', '1', '[添加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:36:08');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2946ec0ed4aa47906163e10d02556acf', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:10:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('295e5e02357b6bb2fa39db52c30a98c9', '资源管理', '面板列表', '增加', '1', '[车辆类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-14 13:25:05');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2c5ad6622ab0913572ed15f043b948eb', '资源管理', '操作列表', '增加', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-12 23:57:17');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2c5e5c79d877f32ddc0bb76dd4d12df2', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:28:47');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2db5b5cf30ba7a20b2a150ca3deb7203', '资源管理', '菜单树', '修改', '1', '[承运商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 10:17:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2dcc81856fe20db0a5d26558b9cb739f', '资源管理', '操作列表', '编辑', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-15 09:40:44');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2ea91fb7f4393c047fa190e60f6606ba', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 17:01:29');
INSERT INTO `t_carrierlogin_operalog` VALUES ('2f7bc6965daa6e257b92e86f61cad260', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:54:59');
INSERT INTO `t_carrierlogin_operalog` VALUES ('31282276126d82a9bcb315e4d2f04659', '下拉项管理', '下拉项树', '增加', '1', '[承运商车辆信息] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 08:53:04');
INSERT INTO `t_carrierlogin_operalog` VALUES ('31d8fbe01bb5e572e7d895e80ace3cd6', '资源管理', '菜单树', '增加', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 15:24:23');
INSERT INTO `t_carrierlogin_operalog` VALUES ('32fe4b13a8f1a804993165ec85d90073', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 16:37:25');
INSERT INTO `t_carrierlogin_operalog` VALUES ('3482c5ed3350d924914bb29ff5e4efd2', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 14:47:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('348a5b12de581d5d26523bd3617f3364', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 00:28:38');
INSERT INTO `t_carrierlogin_operalog` VALUES ('34a082620aeed48019279c24655e8a85', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:26:26');
INSERT INTO `t_carrierlogin_operalog` VALUES ('37f038acdced64377830d09e1e5a6204', '下拉项管理', '下拉列表', '增加', '1', '[运输中] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:24');
INSERT INTO `t_carrierlogin_operalog` VALUES ('381cf230a471bcfae45f829d9531912a', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('3a6c3bcb292c44128947c3d8da07b393', '资源管理', '菜单树', '增加', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-11 10:19:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('42e36bdef8403c5303560ecbffa498ae', '资源管理', '菜单树', '增加', '1', '[车辆类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 13:24:42');
INSERT INTO `t_carrierlogin_operalog` VALUES ('46bc9494fef9c015a7376e1ffd2203e4', '下拉项管理', '下拉列表', '增加', '1', '[返程车] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 08:59:36');
INSERT INTO `t_carrierlogin_operalog` VALUES ('48ef7840f169471ba1b13c44f167e1db', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 13:44:12');
INSERT INTO `t_carrierlogin_operalog` VALUES ('4b4ef517d4c873c4038ae643579c355e', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:28');
INSERT INTO `t_carrierlogin_operalog` VALUES ('4c0e02163dd18bd2b7aa7bcf036a86d2', '资源管理', '面板列表', '增加', '1', '[承运商车辆信息列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-13 08:42:09');
INSERT INTO `t_carrierlogin_operalog` VALUES ('53e3ac8e442c41aa96cf91d5a9da0874', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:08:19');
INSERT INTO `t_carrierlogin_operalog` VALUES ('542503557f57d9d15aaca49088ef32fa', '资源管理', '菜单树', '增加', '1', '[会银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-09 17:44:26');
INSERT INTO `t_carrierlogin_operalog` VALUES ('55256cf9b93daea83344014a63f10048', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-12 23:59:17');
INSERT INTO `t_carrierlogin_operalog` VALUES ('559049021eb45cd56194608931d592cb', '资源管理', '菜单树', '增加', '1', '[仓库类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-15 15:52:23');
INSERT INTO `t_carrierlogin_operalog` VALUES ('5659b685f16c1e0f32cfe1a6ea87c182', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-11 09:42:03');
INSERT INTO `t_carrierlogin_operalog` VALUES ('57bced1c720ac1f8974fded9972fad3e', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:28:09');
INSERT INTO `t_carrierlogin_operalog` VALUES ('5c3678321e5caa821e18f47349325cb8', '资源管理', '操作列表', '增加', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-11 16:16:09');
INSERT INTO `t_carrierlogin_operalog` VALUES ('5c66ed1f548a315d710f246d00a52076', '资源管理', '菜单树', '增加', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-09 17:34:47');
INSERT INTO `t_carrierlogin_operalog` VALUES ('5e645a26af9be63c78a6ec93273edbf2', '资源管理', '菜单树', '修改', '1', '[承运商银行卡信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('5fea5b770aeeaf9a35dc8465c6120115', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:03');
INSERT INTO `t_carrierlogin_operalog` VALUES ('63afc2da4d28b953cdcefe154985563f', '资源管理', '操作列表', '增加', '1', '[企业认证] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 17:03:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('67327d0c3e45c2b0f974eaa1c6e33988', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 10:19:41');
INSERT INTO `t_carrierlogin_operalog` VALUES ('6a76b9c07629069ab983af901fa0febb', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 16:36:28');
INSERT INTO `t_carrierlogin_operalog` VALUES ('6d2ea18c4ece2fdbb811985bf6a90338', '资源管理', '面板列表', '增加', '1', '[合同类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-09 17:35:24');
INSERT INTO `t_carrierlogin_operalog` VALUES ('6fa232fb0d0ce90e38f235341bcfdfa1', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:57');
INSERT INTO `t_carrierlogin_operalog` VALUES ('70914cacc2422c6e71d594eb70a0a6d5', '资源管理', '面板列表', '增加', '1', '[承运商银行卡列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-12 23:57:57');
INSERT INTO `t_carrierlogin_operalog` VALUES ('713bf022689e6b70b005acecaf28eced', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 15:52:03');
INSERT INTO `t_carrierlogin_operalog` VALUES ('718760637d37b10c4667db94a0b5f49e', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:49:01');
INSERT INTO `t_carrierlogin_operalog` VALUES ('74f037068fd5a6a20aa63c8955a6c07b', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:26:45');
INSERT INTO `t_carrierlogin_operalog` VALUES ('74fb679d76cb8ac3b1af1ccdd67348ac', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:36:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7616f071345e4c247e96a99fd122b5d1', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 15:49:03');
INSERT INTO `t_carrierlogin_operalog` VALUES ('78afcbd2326d7e48869ae9c87184b3b0', '资源管理', '面板列表', '增加', '1', '[货主会员等级列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-10 14:46:17');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7a1ec9fb3b588cdc8553bfc995ec4e11', '资源管理', '操作列表', '增加', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 09:40:25');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7b47192b240c663baf4e365c08be0b99', '资源管理', '菜单树', '修改', '1', '[地区管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:40');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7e126ec873390c9d2d225392b74733e3', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:40:19');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7e9636ff149088c7dc0910d40e201d53', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-10 14:48:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7f28c65ee954c3220f7c36903ec90bd0', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 13:26:08');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7fbae4b6780cc04913b08dce9c00daee', '下拉项管理', '下拉项树', '修改', '1', '[承运商管理] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:51:12');
INSERT INTO `t_carrierlogin_operalog` VALUES ('7fd132b71df1e6e7268331c0e0aeec71', '资源管理', '菜单树', '增加', '1', '[承运商车辆信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-13 08:41:36');
INSERT INTO `t_carrierlogin_operalog` VALUES ('809e45331647be0ef4fe4902a144e9b2', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-14 13:26:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('85d6754b401d2cfe0e21e92277f8befe', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 16:36:00');
INSERT INTO `t_carrierlogin_operalog` VALUES ('85e71cf0e792882ce270672f35dd2cb9', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 15:50:26');
INSERT INTO `t_carrierlogin_operalog` VALUES ('86095896ff2a6c6319fc522a9d3e7621', '资源管理', '面板列表', '增加', '1', '[信誉度类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-14 16:35:25');
INSERT INTO `t_carrierlogin_operalog` VALUES ('86f6a7c6e3d4ad273f39bb3b355851ec', '资源管理', '菜单树', '修改', '1', '[积分类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 13:09:27');
INSERT INTO `t_carrierlogin_operalog` VALUES ('87b6637368b1f0c5b5719fc851d0fac3', '下拉项管理', '下拉项树', '修改', '1', '[车辆运输状态] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 09:08:45');
INSERT INTO `t_carrierlogin_operalog` VALUES ('87fa7fe1dad6d5984030efcd004f11e6', '资源管理', '操作列表', '增加', '1', '[企业认证] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 17:00:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('880b2b178d3c1662b858fd6be0798156', '资源管理', '菜单树', '修改', '1', '[会银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:47:43');
INSERT INTO `t_carrierlogin_operalog` VALUES ('882c78c3d2e9d5c7cf5a08da214e5c46', '资源管理', '面板列表', '增加', '1', '[承运商列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-11 16:14:26');
INSERT INTO `t_carrierlogin_operalog` VALUES ('892f2f04e40a4feee5776b92efc997be', '下拉项管理', '下拉项树', '修改', '1', '[车辆运输状态] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 10:21:38');
INSERT INTO `t_carrierlogin_operalog` VALUES ('8a97eec62f5c6ef53ca1f32e6fb68771', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 08:44:41');
INSERT INTO `t_carrierlogin_operalog` VALUES ('8ef896e5b8ebd08f95335958ff251ffb', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:38:50');
INSERT INTO `t_carrierlogin_operalog` VALUES ('8fd5a316ddb5a08315dd52d8455f2e22', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:38:10');
INSERT INTO `t_carrierlogin_operalog` VALUES ('90f43da3e3c3d8848326acd3bf3b92c7', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 15:54:39');
INSERT INTO `t_carrierlogin_operalog` VALUES ('917e99aa13e0d80296aabeabd4c9377a', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 16:17:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('919c9debc3dd18f2b60f5338bb510dbb', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-14 15:27:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('93cb99c615b4ab8ddc49baac665e2f98', '下拉项管理', '下拉项树', '修改', '1', '[承运商管理] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:51:51');
INSERT INTO `t_carrierlogin_operalog` VALUES ('96e7e38235cb23016078462e20e20c19', '下拉项管理', '下拉列表', '增加', '1', '[待调动] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:08');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9a2084e4ce667ec69b30c77ffcb9ce37', '资源管理', '面板列表', '增加', '1', '[会员合同列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-09 17:59:50');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9c20e99ce87d767fd5aee0b37850bafa', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 10:16:31');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9c25f8b93e2061eab926fa81432207d7', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 15:26:27');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9cd09dc4f4944f2b3b3082d8ef342fac', '资源管理', '菜单树', '修改', '1', '[信誉记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:26:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9ded65bcb95d726eb3bf4faabd55ca52', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 17:04:01');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9e65b0e2a7cf78659f539e9faae9b02f', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 18:02:18');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9fb88bd3a2f7b251a88516b036a43bb0', '下拉项管理', '下拉列表', '增加', '1', '[维修中] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:38');
INSERT INTO `t_carrierlogin_operalog` VALUES ('9fba40475ecacaa1ab4c978f13b81af4', '资源管理', '菜单树', '修改', '1', '[承运商银行卡信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:31');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a0c63f7f528b7a1cf948be90973a7cc6', '资源管理', '菜单树', '增加', '1', '[积分类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-10 11:17:22');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a221301b370105349a04542e770322a6', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a22606a0c6f8d1dad686e2859dd688ba', '资源管理', '面板列表', '修改', '1', '[会员合同列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-10-09 21:14:26');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a258156f86e86bb1bfa483bd9baada67', '下拉项管理', '下拉项树', '增加', '1', '[承运商管理] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 08:50:45');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a3dd91caa4f66a7a3f8759004376f361', '资源管理', '面板列表', '修改', '1', '[承运商列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-10-11 16:16:54');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a46c5226c13f8227b763c4070afd86a8', '下拉项管理', '下拉项树', '增加', '1', '[改变类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-10 11:30:52');
INSERT INTO `t_carrierlogin_operalog` VALUES ('a4e7c3586fa2bb2588bcf170f7cffcb5', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 15:49:41');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ac3f9fd543aacb5720822a8fd2de10cc', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 13:25:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ad549b2b5c17e60ce294f97bda79d3ae', '下拉项管理', '下拉列表', '增加', '1', '[增加] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-10 11:31:15');
INSERT INTO `t_carrierlogin_operalog` VALUES ('adf19e058c95bc88b3811ac4756aa4ed', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:27');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ae04f9a25842176e4c3e30450ff20ed5', '下拉项管理', '下拉项树', '增加', '1', '[信誉类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-14 15:30:07');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b0c54da5b478ca2f0b8a67ffefc816db', '下拉项管理', '下拉列表', '修改', '1', '[增加] 下拉项值信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-10-10 11:31:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b272835ca532fc441b7f543345e05c6e', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 15:50:11');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b36a0c9eddf34c73124e74b2f6e05087', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 08:44:13');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b6608943a60b882228cf5d2947b27eee', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:36');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b66584a35ebb5760dfacdbbb84d7a9a5', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 15:49:34');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b7c28723ea84f1ce433ae57bda24aaea', '新闻管理', '新闻列表', '修改', '1', '[十五年一遇的双情人节，大家准备好了吗？] 新闻信息已修改', 'com.glacier.frame.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-10-13 09:32:41');
INSERT INTO `t_carrierlogin_operalog` VALUES ('b815dde13dcd924c541c6f1bc8d0a7d8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 21:15:10');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ba65744dfc6a888dd31a1e6d1d455ee2', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:26:34');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bb0324f283e1351cd35da30a847f03e8', '资源管理', '菜单树', '修改', '1', '[下拉项管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:36');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bc29bb0cba153acf12d67d8ea4e6c35e', '资源管理', '菜单树', '增加', '1', '[承运商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-11 10:15:54');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bc851cbcf2294acf5ad9a573b9e6c5fb', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:55:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bda0f2b90c1ee7802e848e897570d30a', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 15:54:05');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bdac93f3147e98a21cc878184195917e', '资源管理', '菜单树', '增加', '1', '[仓库管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-15 15:51:31');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bf2ef8cc915798d24f195bedfb844648', '资源管理', '菜单树', '增加', '1', '[承运商信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-11 13:53:16');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bf6565500a57f1ba1856bdf6cb3b2573', '资源管理', '菜单树', '增加', '1', '[信誉度类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 16:35:06');
INSERT INTO `t_carrierlogin_operalog` VALUES ('bff9291690196d8d125e67333db1f8c3', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-10 12:36:38');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c0b261d6e6568862551720199218b165', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:09:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c0e92bc4258532cc2e942186ab2825ad', '下拉项管理', '下拉列表', '增加', '1', '[减少] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-10 13:37:10');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c23f17de457fefc35c2a652a0112ddad', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 08:45:11');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c30534f02fbc5297006a5598136ad2e0', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 13:26:28');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c30fe9bbb862c2363b9620ddfdd9e746', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 14:47:48');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c3412aa696b8e3f187c12c04c84d910a', '下拉项管理', '下拉项树', '增加', '1', '[服务类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 08:58:50');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c38cdadfe01a9d82f87c55e2c4e4b27a', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:54:13');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c435cd76cf169922af68fa0a2e03aec8', '资源管理', '面板列表', '增加', '1', '[承运商信誉等级列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-13 15:48:10');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c4b317b62e98f33447409f7a344237aa', '资源管理', '菜单树', '增加', '1', '[信誉记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 15:26:15');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c51bd35c8e814f6a727b8aff54ea7793', '资源管理', '菜单树', '修改', '1', '[承运商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 10:17:18');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c58b0c8f29bc0821ce2fbfb4b6f904e4', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:46:33');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c67bec3aaf34b06f0747ec752a3f96e5', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 02:56:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c6c8e9deaefa0a095218095da5681b00', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:46:50');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c9d8b70f663f22fdc1e9eabd75a70351', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 14:48:09');
INSERT INTO `t_carrierlogin_operalog` VALUES ('c9f8e99f6d270b6ee6995177eaaa0b66', '资源管理', '菜单树', '修改', '1', '[货主会员等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:49');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ca4fc2e7d56c7a1e51dc56c8fc77024d', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 15:26:56');
INSERT INTO `t_carrierlogin_operalog` VALUES ('cac3d27caab9f633817e8f0b589e0a38', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-14 13:27:36');
INSERT INTO `t_carrierlogin_operalog` VALUES ('cb71a34e5e8e4264bb0e6ffcfe31aef4', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:49:24');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ccb1f7f6dd574af98872085ac8b420c1', '资源管理', '菜单树', '增加', '1', '[货主会员等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-10 14:45:44');
INSERT INTO `t_carrierlogin_operalog` VALUES ('cd57c7c90bdeac103e528914c300b8b5', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:27:44');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ceacd9198a1d7b3d7c28d2f84ade54e8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 13:53:45');
INSERT INTO `t_carrierlogin_operalog` VALUES ('cf604a42b3449dd84b8472cf7e41b005', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 12:34:40');
INSERT INTO `t_carrierlogin_operalog` VALUES ('d028a58f9521c5af1b7d0539ea7d764d', '资源管理', '菜单树', '增加', '1', '[承运商银行卡信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-12 23:54:56');
INSERT INTO `t_carrierlogin_operalog` VALUES ('d215213fe9b3bcb01a53cec3c3c3126b', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 00:31:38');
INSERT INTO `t_carrierlogin_operalog` VALUES ('d86617341a77e225520c6be55dd1f5eb', '下拉项管理', '下拉项树', '增加', '1', '[车辆类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 09:05:34');
INSERT INTO `t_carrierlogin_operalog` VALUES ('d9cb89b949cc7c41ac01db017303c399', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:41');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ddb4aec6c975d5b9212d2ae7f8592b93', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:55:27');
INSERT INTO `t_carrierlogin_operalog` VALUES ('de8fb795225118c5008126721d5e74cd', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 12:36:21');
INSERT INTO `t_carrierlogin_operalog` VALUES ('e3370323c8cfe8291cbfd69e3d3d6b17', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 12:35:40');
INSERT INTO `t_carrierlogin_operalog` VALUES ('e355d1a3b1b29c0425edc00f89d56f31', '下拉项管理', '下拉列表', '增加', '1', '[单程专线] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:00:04');
INSERT INTO `t_carrierlogin_operalog` VALUES ('e3bc5a9b0072d51164abe9154a4779c1', '资源管理', '操作列表', '编辑', '1', '[企业认证] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 17:00:14');
INSERT INTO `t_carrierlogin_operalog` VALUES ('e3e6728be7794842a8c41ca8eaa26717', '下拉项管理', '下拉列表', '增加', '1', '[配送] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-14 15:32:12');
INSERT INTO `t_carrierlogin_operalog` VALUES ('e79b0aca28bd03144c80a573e33ea821', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:54:31');
INSERT INTO `t_carrierlogin_operalog` VALUES ('e7e1209367a116d6710ddca20a9c5b2a', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 00:31:18');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ea3aa707206c46ba928e882df7743824', '资源管理', '菜单树', '修改', '1', '[承运商信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:17');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ea757e4c51364866a5a1f568518b484f', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:57');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ec209d5152c39e15b62bcf9f9127ee89', '资源管理', '操作列表', '编辑', '1', '[添加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-11 09:09:46');
INSERT INTO `t_carrierlogin_operalog` VALUES ('ee2ebda766307efa5b8b7ded932a09e2', '资源管理', '菜单树', '增加', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-09 17:53:59');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f05987e381e112ed5443271d97e4dac8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-10 11:19:16');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f13fbbc5279cf1920352399541342d03', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-15 09:40:55');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f1a5a2a096bcc2e879d519ae270a9598', '资源管理', '菜单树', '增加', '1', '[承运商信誉等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-13 15:47:45');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f4934c7f158cd83f46db6919f9ffa594', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-12 23:58:54');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f6381856414402944312c03c196e33d9', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 15:55:04');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f78328df7d7a6ca00622d87ed84b6850', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:52');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f914600745ffc358d5559416ededd875', '下拉项管理', '下拉列表', '增加', '1', '[暂停运输] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:53');
INSERT INTO `t_carrierlogin_operalog` VALUES ('f94fab38bec8e8be1ac8172116b7d375', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-15 15:55:17');
INSERT INTO `t_carrierlogin_operalog` VALUES ('fa1590fa5bcc231646b5216ad83fa22b', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 13:38:37');
INSERT INTO `t_carrierlogin_operalog` VALUES ('fbca8f32aa695fcae011adb0f25c3ac7', '资源管理', '面板列表', '增加', '1', '[积分类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-10 11:18:48');
INSERT INTO `t_carrierlogin_operalog` VALUES ('fee160ba1d9ae43e259f0f2d7facc8a0', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-14 16:38:01');

-- ----------------------------
-- Table structure for `t_carrierlogin_panel`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_panel`;
CREATE TABLE `t_carrierlogin_panel` (
  `panel_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_cn_name` varchar(50) default NULL,
  `panel_en_name` varchar(50) default NULL,
  `order_num` int(11) default NULL,
  PRIMARY KEY  (`panel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_panel
-- ----------------------------
INSERT INTO `t_carrierlogin_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('39c5ecaa9e63b36e48f6eed0fc38f3fb', '7d7c98a8eb32ff5412d26b3e8ebf1b18', '承运商合同列表', 'CarrierContractList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_carrierlogin_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '2');
INSERT INTO `t_carrierlogin_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('6b20ba67a120ba1fcaa5283c8c950f6d', 'a4144902eb68672fb147ef21d9470062', '承运商列表', 'carrierMemberList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('6bfbd59acf32fcab67d66381277f10b5', '9d9cc5684aa7dbf549d481d539fd3fe7', '车辆类型列表', 'CarrierCartypeList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('708e17657b99ed5a01fdaedba102defd', 'fe60a1800397a1c7d62ad980adf7cedb', '信誉度类型列表', 'CreditworthinessTypeList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_carrierlogin_panel` VALUES ('a958fbe814da1040b304b0a55ad4b87d', '1da447eee943017b61e8da3c8acdc9ec', '承运商信誉等级列表', 'CarrierMemberGradList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('b641fe58b8f9d34c77f557159beaca5f', '0d6ca38f1d454978003bc83312a92266', '承运商车辆信息列表', 'carrierCarInformationList', '1');
INSERT INTO `t_carrierlogin_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_carrierlogin_panel` VALUES ('fc1773fcced1a73ea1a36af0a233c684', 'd2cb9b9c44425ca4f4bf4dd2c3062371', '承运商银行卡列表', 'CarrierBankCardList', '1');

-- ----------------------------
-- Table structure for `t_carrierlogin_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_role`;
CREATE TABLE `t_carrierlogin_role` (
  `role_id` varchar(32) NOT NULL,
  `role_en_name` varchar(25) NOT NULL,
  `role_cn_name` varchar(25) default NULL,
  `builtin` varchar(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_role
-- ----------------------------
INSERT INTO `t_carrierlogin_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '承运商管理员', 'admin', null, '816e0e99f17cd7a2c6f5d799da1f8159', '2014-01-16 02:58:58');

-- ----------------------------
-- Table structure for `t_carrierlogin_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_user`;
CREATE TABLE `t_carrierlogin_user` (
  `user_id` varchar(32) NOT NULL,
  `username` varchar(20) NOT NULL,
  `user_cn_name` varchar(50) default NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(50) default NULL,
  `status` enum('disable','enable') NOT NULL,
  `builtin` enum('custom','builtin','admin') NOT NULL,
  `email` varchar(50) default NULL,
  `user_image` varchar(50) default NULL,
  `remark` varchar(255) default NULL,
  `last_login_time` datetime default NULL,
  `last_login_ip_address` varchar(150) default NULL,
  `login_count` int(10) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrierlogin_user
-- ----------------------------
INSERT INTO `t_carrierlogin_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, 'XXXXXXXXX', '2014-10-20 16:07:26', '127.0.0.1[本地]', '1124', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
INSERT INTO `t_carrierlogin_user` VALUES ('d31a15b0c9abe32744dc16203b9547d8', 'administrators', '客户管理员', 'f418eabf12e35e6112d8783ef6751c0da68782b5', 'd5a18894f8d85631', 'enable', 'custom', 'administrators@qq.com', null, '后台管理员', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-07-28 16:30:17');
INSERT INTO `t_carrierlogin_user` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', 'adminTest', '客户管理员', 'd7d62bc0a343ffea509247f1a7c92120e762771d', 'baaa252597ec918e', 'enable', 'custom', 'adminTest@163.com', null, '客户、测试使用账号', '2014-08-04 17:53:34', '127.0.0.1[本地]', '4', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:40:42');

-- ----------------------------
-- Table structure for `t_carrierlogin_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrierlogin_user_role`;
CREATE TABLE `t_carrierlogin_user_role` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `role_id` varchar(32) NOT NULL COMMENT '角色Id',
  PRIMARY KEY  (`user_id`,`role_id`),
  KEY `FK_t_user_role2` (`role_id`),
  CONSTRAINT `t_carrierlogin_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_carrier_member` (`carrier_member_id`),
  CONSTRAINT `t_carrierlogin_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `t_carrierlogin_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of t_carrierlogin_user_role
-- ----------------------------
INSERT INTO `t_carrierlogin_user_role` VALUES ('350060c0c7bc99adf49e431c35124e29', 'c87dd7161dbf8777c41b8cbfaa985db4');

-- ----------------------------
-- Table structure for `t_carrier_among_route`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_among_route`;
CREATE TABLE `t_carrier_among_route` (
  `among_id` varchar(32) NOT NULL,
  `router_id` varchar(32) default NULL,
  `carrier_member_id` varchar(32) default NULL,
  PRIMARY KEY  (`among_id`),
  KEY `FK_carrier_member_among_route_carrier_member_id` (`carrier_member_id`),
  KEY `FK_route_carrier_member_carrier_member_id` (`router_id`),
  CONSTRAINT `t_carrier_among_route_ibfk_1` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`),
  CONSTRAINT `t_carrier_among_route_ibfk_2` FOREIGN KEY (`router_id`) REFERENCES `t_carrier_route` (`router_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_among_route
-- ----------------------------
INSERT INTO `t_carrier_among_route` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for `t_carrier_bank_card`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_bank_card`;
CREATE TABLE `t_carrier_bank_card` (
  `bankcard_id` varchar(32) NOT NULL,
  `carrier_member_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `bank_name` varchar(32) default NULL,
  `card_name` varchar(32) default NULL,
  `card_number` varchar(32) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`bankcard_id`),
  KEY `FK_carrier_membe_bank_card_carrier_member_id` (`carrier_member_id`),
  CONSTRAINT `FK_carrier_membe_bank_card_carrier_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_bank_card
-- ----------------------------
INSERT INTO `t_carrier_bank_card` VALUES ('1', '1', null, '中国工商银行', '借记卡', '123456789023', 'pass', '8b25651c2d896297530b64e4b80ec503', '银行卡审核', '2014-10-13 00:01:11', '通过', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 00:00:34', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 00:16:30');

-- ----------------------------
-- Table structure for `t_carrier_car_information`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_car_information`;
CREATE TABLE `t_carrier_car_information` (
  `car_id` varchar(32) NOT NULL,
  `carrier_member_id` varchar(32) default NULL,
  `route_name` int(20) default NULL,
  `transport_type` enum('all','partial') default NULL,
  `service_type` enum('backTracking','onePath') default NULL,
  `plate_number` varchar(32) default NULL,
  `car_age` int(5) default NULL,
  `car_type` varchar(32) default NULL,
  `car_length` int(5) default NULL,
  `car_load` varchar(32) default NULL,
  `car_attribution` varchar(50) default NULL,
  `car_status` enum('enable','disable') default NULL,
  `transport_status` enum('wait','inTransit','servicing','cease') default NULL,
  `car_img` text,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`car_id`),
  KEY `FK_carrier_member_car_information_carrier_member_id` (`carrier_member_id`),
  CONSTRAINT `FK_carrier_member_car_information_carrier_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_car_information
-- ----------------------------
INSERT INTO `t_carrier_car_information` VALUES ('edfecf364dd8ef113665cb81f285a5dc', '2', '1', 'partial', 'backTracking', '京78888', '12', '大货车', '10', '23', '广东珠海', 'enable', 'wait', null, 'authstr', null, null, null, '苍茫天涯是我的爱！', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 15:29:12', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 15:29:12');
INSERT INTO `t_carrier_car_information` VALUES ('ee32a1c53e4f521d6449b659b517bd13', '1', '2', 'all', 'backTracking', '粤88888', '3', '小型车', '6', '10', '广东廉江', 'enable', 'inTransit', null, 'pass', '8b25651c2d896297530b64e4b80ec503', '哈哈', '2014-10-13 15:16:50', '西iiiiiiiii！', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 15:12:47', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 15:12:47');

-- ----------------------------
-- Table structure for `t_carrier_contract_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_contract_record`;
CREATE TABLE `t_carrier_contract_record` (
  `contract_record_id` varchar(32) NOT NULL,
  `deliver_id` varchar(32) default NULL,
  `carrier_member_id` varchar(32) default NULL,
  `platform_id` varchar(32) default NULL,
  `contract_type` varchar(32) default NULL,
  `status` enum('enable','disable') default NULL,
  `contract_content` varchar(255) default NULL,
  `enable_time` datetime default NULL,
  `disable_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`contract_record_id`),
  KEY `FK_carrier_member_contract_record_carrier_member_id` (`carrier_member_id`),
  CONSTRAINT `FK_carrier_member_contract_record_carrier_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_contract_record
-- ----------------------------
INSERT INTO `t_carrier_contract_record` VALUES ('1', '仙贝', '1', '越海平台', '1', 'enable', '我们遵纪守法', '2014-10-13 00:04:16', '2014-10-13 00:04:19', '签署成功', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 00:04:38', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 00:04:42');

-- ----------------------------
-- Table structure for `t_carrier_creditworthiness_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_creditworthiness_type`;
CREATE TABLE `t_carrier_creditworthiness_type` (
  `creditworthiness_type_id` varchar(32) NOT NULL,
  `creditworthiness_type` varchar(50) default NULL COMMENT '信誉度类型',
  `change_type` enum('increase','reduction') default NULL COMMENT '增加或者减少信誉度',
  `change_value` int(10) default NULL COMMENT '信誉值',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`creditworthiness_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_creditworthiness_type
-- ----------------------------
INSERT INTO `t_carrier_creditworthiness_type` VALUES ('1', 'dispatching', 'increase', '2', '配送一次+2信誉值', null, null, null, null);

-- ----------------------------
-- Table structure for `t_carrier_deliver_goods_area`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_deliver_goods_area`;
CREATE TABLE `t_carrier_deliver_goods_area` (
  `deliver_goods_area_id` varchar(32) NOT NULL,
  `router_id` varchar(32) default NULL,
  `deliver_name` varchar(32) default NULL,
  `price` decimal(16,4) default NULL,
  `address` varchar(50) default NULL,
  `telephone` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`deliver_goods_area_id`),
  KEY `FK_carrier_route_deliver_goods_area_router_id` (`router_id`),
  CONSTRAINT `t_carrier_deliver_goods_area_ibfk_1` FOREIGN KEY (`router_id`) REFERENCES `t_carrier_route` (`router_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_deliver_goods_area
-- ----------------------------
INSERT INTO `t_carrier_deliver_goods_area` VALUES ('1', '1', '香洲区', '20.0000', null, null, null);
INSERT INTO `t_carrier_deliver_goods_area` VALUES ('2', '1', '金鼎区', '10.0000', null, null, null);

-- ----------------------------
-- Table structure for `t_carrier_driver`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_driver`;
CREATE TABLE `t_carrier_driver` (
  `driver_id` varchar(32) NOT NULL,
  `carrier_member_id` varchar(32) NOT NULL,
  `driver_carrier_id` varchar(32) default NULL,
  `driver_name` varchar(32) default NULL,
  `age` int(5) default NULL,
  `driver_age` int(5) default NULL,
  `sex` enum('man','woman') default NULL,
  `driver_license_id` int(20) default NULL,
  `driver_license_time` datetime default NULL,
  `phone` varchar(32) default NULL,
  `address` varchar(50) default NULL,
  `card_id` varchar(32) default NULL,
  `driver_photo` varchar(255) default NULL,
  `status` enum('enable','disable') default NULL,
  `driver_status` enum('wait','inTransit','leave','cease') default NULL,
  `email` varchar(32) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`driver_id`),
  KEY `FK_carrier_member_driver_carrier_member_id` (`carrier_member_id`),
  CONSTRAINT `FK_carrier_member_driver_carrier_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_driver
-- ----------------------------

-- ----------------------------
-- Table structure for `t_carrier_enterpriser_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_enterpriser_member`;
CREATE TABLE `t_carrier_enterpriser_member` (
  `carrier_member_id` varchar(32) NOT NULL,
  `enterprise_name` varchar(32) default NULL,
  `deputy` varchar(32) default NULL,
  `area` varchar(50) default NULL,
  `detailed_address` varchar(255) default NULL,
  `property` varchar(32) default NULL,
  `enterprise_type` varchar(32) default NULL,
  `trade` varchar(32) default NULL,
  `enterprise_phone` varchar(32) default NULL,
  `enterprise_img` varchar(32) default NULL,
  `enterprise_logo` varchar(255) default NULL,
  `enterprise_fax` varchar(32) default NULL,
  `enterprise_summary` varchar(255) default NULL,
  `auth_state` enum('authstr','pass','failure') default NULL,
  `auth` varchar(32) default NULL,
  `auth_remark` varchar(255) default NULL,
  `auth_time` datetime default NULL,
  PRIMARY KEY  (`carrier_member_id`),
  CONSTRAINT `FK_carrier_member_enterpriser_carier_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_enterpriser_member
-- ----------------------------
INSERT INTO `t_carrier_enterpriser_member` VALUES ('2', '申通', 'join', '深圳', ' 深圳宝安区', '私营', '物流公司', '运输业', '0', '0', '0', '0', '0', 'pass', null, '', null);

-- ----------------------------
-- Table structure for `t_carrier_individuality_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_individuality_member`;
CREATE TABLE `t_carrier_individuality_member` (
  `carrier_member_id` varchar(32) NOT NULL,
  `sex` enum('man','woman') default NULL,
  `member_age` int(5) default NULL,
  `home_phone` varchar(32) default NULL,
  `card_id` varchar(32) default NULL,
  `member_real_name` varchar(32) default NULL,
  `member_qq` int(20) default NULL,
  `mobile_number` varchar(32) default NULL,
  `detailed_address` varchar(100) default NULL,
  PRIMARY KEY  (`carrier_member_id`),
  CONSTRAINT `FK_carrier_member_individuality_carrier_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_individuality_member
-- ----------------------------
INSERT INTO `t_carrier_individuality_member` VALUES ('1', 'man', '12', null, '2', '2', '2', '2', '2');

-- ----------------------------
-- Table structure for `t_carrier_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_member`;
CREATE TABLE `t_carrier_member` (
  `carrier_member_id` varchar(32) NOT NULL,
  `member_name` varchar(32) default NULL,
  `member_password` varchar(64) default NULL,
  `traders_password` varchar(64) default NULL,
  `live_address` varchar(32) default NULL,
  `member_photo` varchar(255) default NULL,
  `registration_time` datetime default NULL,
  `last_login_time` datetime default NULL,
  `email` varchar(32) default NULL,
  `member_type` enum('individuality','enterprise') default NULL,
  `status` enum('enable','disable') default NULL,
  `login_count` int(5) default NULL,
  `last_login_ip_address` varchar(32) default NULL,
  `credit_limit` decimal(16,4) default NULL,
  `creditworthiness` int(5) default NULL,
  `surplus_monney` decimal(16,4) default NULL,
  `deliver_success` int(5) default NULL,
  `deliver_fail` int(5) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_member
-- ----------------------------
INSERT INTO `t_carrier_member` VALUES ('1', 'sing', '123', '123', '1', null, '2014-10-11 14:33:16', '2014-10-11 14:33:19', '11@qq.com', 'individuality', 'enable', '1', '0', '0.0000', '0', '0.0000', '0', '0', 'authstr', null, null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-10-11 14:34:05', '8b25651c2d896297530b64e4b80ec503', '2014-10-11 14:34:09');
INSERT INTO `t_carrier_member` VALUES ('2', '申通快递', '123', '123', '2', null, '2014-10-11 15:45:21', '2014-10-11 15:45:24', '222@qq,nn', 'enterprise', 'disable', '2', '0', '0.0000', '0', '0.0000', '0', '0', 'authstr', null, '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-10-11 15:46:03', '8b25651c2d896297530b64e4b80ec503', '2014-10-11 15:46:06');
INSERT INTO `t_carrier_member` VALUES ('350060c0c7bc99adf49e431c35124e29', 'zhangsan', '1f9a1dad13de41e8519b0f9c177f5a9a75609a53', '1f9a1dad13de41e8519b0f9c177f5a9a75609a53', null, 'http://bdmu.v068041.10000net.cn/netloan-website/resources/images/carrierMember/carrierMember.jpg', '2014-10-21 17:14:34', '2014-10-21 17:15:01', '406592176@qq.com', 'individuality', 'enable', '3', '127.0.0.1[本地]', '0.0000', '0', '0.0000', '0', '0', 'authstr', null, null, null, '承运商创建帐号', '超级管理员', '2014-10-21 17:14:34', '超级管理员', '2014-10-21 17:14:34');

-- ----------------------------
-- Table structure for `t_carrier_member_creditworthiness`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_member_creditworthiness`;
CREATE TABLE `t_carrier_member_creditworthiness` (
  `carrier_member_creditworthiness_id` varchar(32) NOT NULL,
  `carrier_member_id` varchar(32) default NULL,
  `creditworthiness_type_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`carrier_member_creditworthiness_id`),
  KEY `FK_carrier_member_creditworthiness_member_id` (`carrier_member_id`),
  KEY `FK_carrier_member_creditworthiness_type_id` (`creditworthiness_type_id`),
  CONSTRAINT `t_carrier_member_creditworthiness_ibfk_1` FOREIGN KEY (`creditworthiness_type_id`) REFERENCES `t_carrier_creditworthiness_type` (`creditworthiness_type_id`),
  CONSTRAINT `t_carrier_member_creditworthiness_ibfk_2` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_member_creditworthiness
-- ----------------------------
INSERT INTO `t_carrier_member_creditworthiness` VALUES ('1', '1', '1', '111', null, '2014-10-14 15:20:29', null, null);

-- ----------------------------
-- Table structure for `t_carrier_member_grade`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_member_grade`;
CREATE TABLE `t_carrier_member_grade` (
  `grade_id` varchar(32) NOT NULL,
  `grade_name` varchar(32) default NULL,
  `scope_start` int(5) default NULL,
  `scope_stop` int(5) default NULL,
  `grade_img` varchar(255) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`grade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_member_grade
-- ----------------------------
INSERT INTO `t_carrier_member_grade` VALUES ('b6f5bbc93d6c74ebb6311f54223f68b1', '一级信誉等级', '10', '100', 'http://localhost:8888/global-webapp/resources/upload/image/20141013/20141013155113_958.jpg', 'enable', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 15:51:19', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 15:51:19');

-- ----------------------------
-- Table structure for `t_carrier_member_token`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_member_token`;
CREATE TABLE `t_carrier_member_token` (
  `carrier_member_id` varchar(32) NOT NULL,
  `member_name` varchar(32) default NULL,
  `password` varchar(64) default NULL,
  `salt` varchar(64) default NULL,
  `traders_password` varchar(64) default NULL,
  `traders_salt` varchar(64) default NULL,
  PRIMARY KEY  (`carrier_member_id`),
  CONSTRAINT `FK_carrier_member_grade_member_id` FOREIGN KEY (`carrier_member_id`) REFERENCES `t_carrier_member` (`carrier_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_member_token
-- ----------------------------
INSERT INTO `t_carrier_member_token` VALUES ('1', 'sing', '123', '1', '123', '1');
INSERT INTO `t_carrier_member_token` VALUES ('2', '申通', '123', '2', '123', '2');
INSERT INTO `t_carrier_member_token` VALUES ('350060c0c7bc99adf49e431c35124e29', 'zhangsan', '1f9a1dad13de41e8519b0f9c177f5a9a75609a53', 'ebf3f59ee59f0381', '1f9a1dad13de41e8519b0f9c177f5a9a75609a53', 'ebf3f59ee59f0381');

-- ----------------------------
-- Table structure for `t_carrier_pick_up_goods_area`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_pick_up_goods_area`;
CREATE TABLE `t_carrier_pick_up_goods_area` (
  `pick_up_goods_area_id` varchar(32) NOT NULL,
  `router_id` varchar(32) default NULL,
  `deliver_name` varchar(32) default NULL,
  `price` decimal(16,4) default NULL,
  `address` varchar(50) default NULL,
  `telephone` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`pick_up_goods_area_id`),
  KEY `FK_carrier_route_pick_up_goods_area_router_id` (`router_id`),
  CONSTRAINT `t_carrier_pick_up_goods_area_ibfk_1` FOREIGN KEY (`router_id`) REFERENCES `t_carrier_route` (`router_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_pick_up_goods_area
-- ----------------------------
INSERT INTO `t_carrier_pick_up_goods_area` VALUES ('1', '1', '越秀区', '30.0000', null, null, null);

-- ----------------------------
-- Table structure for `t_carrier_route`
-- ----------------------------
DROP TABLE IF EXISTS `t_carrier_route`;
CREATE TABLE `t_carrier_route` (
  `router_id` varchar(32) NOT NULL,
  `route_name` varchar(32) default NULL,
  `status` enum('enable','disable') default NULL,
  `route_origin` varchar(32) default NULL,
  `route_stop` varchar(32) default NULL,
  `route_type` enum('landCarriage','seaTransportation','air') default NULL,
  `route_bytime` int(5) default NULL,
  `route_number` varchar(32) default NULL,
  `startof_time` datetime default NULL,
  `available_position` float default NULL,
  `box_type` enum('fullClosed','semiClosed','flat') default NULL,
  `cease_take_delivery_time` datetime default NULL,
  `starting_price` decimal(16,4) default NULL,
  `weight_goods_price` decimal(16,4) default NULL,
  `light_goods_price` decimal(16,4) default NULL,
  `extract_goods_time` varchar(32) default NULL,
  `premium` decimal(16,4) default NULL,
  `telephone` varchar(32) default NULL,
  `mileage` varchar(32) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`router_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_carrier_route
-- ----------------------------
INSERT INTO `t_carrier_route` VALUES ('1', '珠海-广州', 'disable', '珠海市香洲区哈工大', '广州市越秀区', 'landCarriage', '2', 'KD000-1', '2014-10-20 13:00:20', '20', 'fullClosed', '2014-10-20 11:00:14', '80.0000', '90.0000', '100.0000', '第二天00:30', '10.0000', '13411381321', '75km', 'pass', null, null, null, '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-10-20 17:30:59');

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL,
  `login_user` varchar(32) default NULL,
  `login_time` datetime default NULL,
  `login_ip` varchar(50) default NULL,
  `browser_version` varchar(50) default NULL,
  `screen_size` varchar(50) default NULL,
  PRIMARY KEY  (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `FK_loginlog_user_loginlog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginlog
-- ----------------------------
INSERT INTO `t_loginlog` VALUES ('016d4464d3b00a22ceeb61a22e9c6287', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 14:49:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('023a60747478f3b0cb3db5f08f7e3596', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 16:37:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('04f6ddc9a4afc3d7afc135f4e701eb75', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 03:54:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('08bb4ea239a2312156273a3ebcf1129c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 16:38:21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('08cb6d64b35a8af4e7497534bcdae971', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-15 16:00:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0b299f626cc6c0a5822537946894826d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:23:42', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0bab92ba0e97a5acf3b9286eb930c048', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 21:50:48', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0c7f6659e429787583f3b5cde9dec76d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 16:19:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0e69cc184705e9d463ab4e032622a44c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 00:45:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0e87c9b6f99f459def18b59d057b1903', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 14:21:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0fcdf496387fd419a17b1fc820f7f7eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 01:49:42', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('10ccbe6fad573ee46c79a61bff489373', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 14:39:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1bc625dc08621c247b8e9515911c8184', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:17:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1ce7b436829270c080f4017806d8d3aa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 15:46:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1e1eea41336f7624e163b62a7dc55cc6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 04:27:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1e8335775c3fa44bf00c5b6755a1140b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 17:38:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1e8d66778715c163e6e7e287454830a6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-15 15:49:51', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2145647f38fce5db55f9750ae6e7de3e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:44:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('21862196a49c827ff9408a0d90b29cf3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:49:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2187bc3b00b48bb7d46b88eb968627e6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 14:25:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('252b8c540b5a6944306c99fca8a1480c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:54:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('266da6b0ec1026bea41a02ef9e24ceb3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:53:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('27447716d61fc60cd6da5a91b5f85189', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:19:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('28cee37c704d8b52631c8faaa1407df5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 14:39:24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2a970d7a6537084da3289973a7cc6cec', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 15:15:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2f6bdb33432dcf8437dee3f86a410bb7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 15:52:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2fa9503ad9927000ee1fe0ee34655d50', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:04:05', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('320b8eecdcb65f354bb8757528fbbf45', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:32:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3241b5d247fb95773350b726745aa2c0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:49:13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('33ece6518e1f983f81fe1bf034daf2f6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:10:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('352ffae660b836a2e07153ba2eccf351', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:37:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('36d1f1a7432e22009987edb77c67b2c3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 04:08:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('36d1feffaf9954272035c0a3cdf3c7d8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:47:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('38ec52c7781e1379a4292b37a9f1df65', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:07:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('411708eb4b7f8bb2b27240ea89c80521', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:22:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('426327c26363e8c9b85bf59a32a8ab60', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 16:45:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('428c54747ce62fcc5b39995ebb36db4b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:47:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('42d2740dbe7a52458239cc813b348ced', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 13:48:28', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4892bb8a899e17b7e8ee247fa10d8b11', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 14:43:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4b02fd0a6457da7a9e1375a9b7dccd22', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 16:27:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4bcc1963df18ded7402a85f8f4fc81b9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:18:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4f4e8d6649d6396ca554257e7cc66760', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 13:28:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4f95d2245c8786c19dc959255a7b0b4e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:21:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('508cffc2094ef3f285b5c30eb7fddaf1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 13:43:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('51500257906ffa1e0009bf2838ecec8f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 14:46:45', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('51bc8418f5f9a6ae9f7368985a0f9459', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 00:11:37', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('530ed379664d99d6c2acbaec049f887e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 14:44:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('549a8d88a0b4d26fdeea9c1523d91cb8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 15:08:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('58139e48fdcd5d0db9ca3a3fb0d511b1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:14:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('59111ff657fa4b78ada3662748286110', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 09:49:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5937d9cd120d8aa74c763dcd2d1d41da', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 22:59:58', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('59aa609ed4408782f33f51b38326bcbc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 21:12:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5d9f3b7548c533ac04dc574e869bc0aa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 08:38:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5ed6e39af58d9397284abce34552875c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-22 09:36:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('63d5d7855d8d53cedfd933a2ff6dca2b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 10:16:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('642ec1e5d6c005cb71c9b28cef8fe49a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 13:24:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('66860726e895e2f69e16cbcd8dd5c7cb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 17:04:36', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('66d1ceaf2bd71199bb5209d80615be86', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-22 09:52:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6720d06e139cdeedd1bb1b17a5836507', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 18:03:25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('678742742ba6c4563cc4ce486dcf41aa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:16:32', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6a01119741962e3d718eb541330d6e3e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 16:31:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6e26891264ff24e9c1992fe1bef81a59', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:12:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('70e1cd3ee3d60f66c77e436df9dd1b27', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 16:33:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('71a727597b99fb6f1b991e21b730d50f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:11:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('73c2823edc2885f5a542e90fa499b4a1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 16:58:23', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('74e52bc2637c8abe107762548144504f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 17:10:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('76b3208d00dc72ab5767853222a62e47', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 17:56:00', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('78d33b8de8306b66cae1eaabe0dbbd48', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 21:23:28', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7bf7380d97c559d917f618b97a833d82', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 12:51:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7cf052075277ad2b8560ee914da80db2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 16:04:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7fd5cd0358eb10da7ff9cc8b86234597', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 14:10:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('80d6ba5fbcce6c9d45da22f2038f82c9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 03:56:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8330bf803a77bdb7d3c4f7bcf844e8e2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:21:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('84a5740b90482be573167e35ce7befa9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 21:56:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('881f2e066769759ddda9f57d81298ec6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:01:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('88a07dd2b677de6c979b094e90dd2689', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:45:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8ceff62c4145822b5d26183a160df84e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 08:57:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8cf04ab561bd82d08164582323697e01', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 22:40:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8eac8b721fe7dd2daf6ce521c5e185f5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:27:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9096a1ed549918ef209d3c8fa8ef17d9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 00:21:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('92ebf0d35d7296f79e0caf9994354198', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:27:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('974ad5ff0f8423854c9143b184dc9c1b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:22:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9ae32b20fa12ca1d4d34fb511930a65e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:11:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9fc2b68c062f423bba0f0873761e95e8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 13:20:51', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a12c86825a2201513acda0eb023675eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 14:59:05', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a1652e6bd1e8e7f882e1e2f0bb1e1966', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-22 09:50:26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a39d582f8ba9c2b701505b187430340d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:30:11', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a3caea9545228026987dbd01b3d255af', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 16:35:47', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a4318ae1e4901e414ed16fb10faa3a04', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 21:09:47', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a56d7b5baf7df1cdde76f4f5368328d5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 13:50:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a6ff065493e64bd4a393ab198bc33dd6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 05:14:58', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a90b05849ee1bb4606efaed475a88296', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 02:21:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ac7769b5dee3ad75fa8e18979cdd9337', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 17:09:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b291c8fc8bf06e5e71f6e8f4586dd349', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:32:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b2be0339920c323abdaf9e785f48a81a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 13:44:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b54f4857bad7483ad0e023503ab717f4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-15 15:55:47', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b9d7dfb2a4acddc08a0bf13e15142501', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 14:22:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ba7ae3dd10903533070addb6ac8be2a4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 13:27:15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bccada78aa9c99b41007595d4b6a2ea9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 13:57:12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bf8d8dd25686031857175a93cad762c7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 10:22:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c00a05a32c78de905a1890631336a7fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:27:15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c2d6bd1dc7e16f1fb2c96ce421ea4a04', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:30:12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c5422b7d7b434980abb1a50bb5678a78', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 22:36:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c6383503aff9985a9ff4bcfcbad5e1eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 11:26:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c9fa07dfb20c78588eeeea43cbd940c8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 13:15:31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cacecaf6cdadaae9fc2548d9683d4476', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:34:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cb8a0bcd35656ad6ab22776b7522d3bd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 22:45:10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ce2ff7ebc8735a08c05983dd77f3f350', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 12:34:14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d073501222c0e089a7f7e090502efdd8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 00:42:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d29679111fb891c450c999bc67100310', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-16 13:19:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d30294e9f1d0fdaf9d05d5994146fd21', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:04:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d4d027de71ff2c2f4ddce79adb8ed928', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 08:46:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d4f47d7132d7686db79fbf3449d07589', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 16:32:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d60fdaf268001d4c1cc86bf58d7ab783', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-22 09:49:42', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d6798c63fe33f6982e6d4b2760acf144', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 15:14:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d77f6832bd6f7eb385b0d0829edefa31', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:22:45', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d8567d22382535c617596d8d2f24ad23', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 10:05:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d8613c98c7457e6cc50bcdf6fa150120', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 01:45:49', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('dae1ae77c0ada5bedd778d2966552d99', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 22:56:15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('dea43111fa4215c6d11ca52402388cb4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:50:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1079ada92f4b8ac2bbef1b318400389', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 05:38:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1b6b0e4b94c6b9e27daf82cf3ea426e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 15:15:45', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e21cd6871b2e781d8d3b8896d444a744', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 15:39:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e3d60f81c0645e25edd1a6372066a7f9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 13:30:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e539c345040ac85df1a64c20797b8be9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 14:10:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e6b53eb5f2bb0bc8853c0b96c4b30fb3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 22:06:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e81c7dbd627c6f9ae049f9c13473c0a5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 21:19:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e9a6b077e281cad789c3266ed2492353', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-21 15:15:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ec330abfd9837add3645137bdfcabf6d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:27:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eee93836080be27eb2a7b8de54e044f8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 17:27:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ef0d970819adfadae272fb1d9ddcdd61', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-17 14:52:23', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ef1e35af8ffd324293fa3787b6084531', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-09 13:58:29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f017be97f1cc08e161988781f9c2eb20', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 09:38:34', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f061ff472f94b381f7c45e1f0c8975fb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:09:17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f4670d4b573c94b5b8082a2020093b8f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-14 13:19:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f5b670bd2d07dfdb78a2990394ca72f4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 04:05:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f7bbd68ab63bf7f2c89b657d435c49d2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 11:10:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f93f610c27db22cd8a85a677f6f5b676', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-20 17:30:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f9919aaedde3a805549ad28be0257a64', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-11 13:59:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('faab57afced701c66fde52d6fc6cf962', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 00:05:21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fdf0e90d5992bb953ab5422b8d08c67b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 15:23:43', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('feafdc64b94fee76bf79ed8ca5b6ee61', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-13 11:09:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('feddf3c972982af08e076a36bbf9d6e4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-10-10 13:25:01', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_member_contract_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_contract_type`;
CREATE TABLE `t_member_contract_type` (
  `contract_type_id` varchar(32) NOT NULL,
  `contract_type_name` varchar(32) default NULL,
  `time_limit` varchar(32) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`contract_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_contract_type
-- ----------------------------
INSERT INTO `t_member_contract_type` VALUES ('1', '货主承运商合同', '1', 'disable', '货主承运商合同', '8b25651c2d896297530b64e4b80ec503', '2014-10-09 21:26:35', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 02:29:24');

-- ----------------------------
-- Table structure for `t_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `menu_id` varchar(32) NOT NULL,
  `pid` varchar(32) default NULL,
  `menu_en_name` varchar(30) default NULL,
  `menu_cn_name` varchar(30) default NULL,
  `icon_cls` varchar(50) default NULL,
  `url` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`menu_id`),
  KEY `FK_menu2parent1N` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('09bd4101bddc24db837be4479b6be382', 'fefe8e9ee335dadbace082923415e023', 'contractManager', '合同类型管理', 'icon-standard-application-double', '/do/contractManager/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('0ad6ee84a7e9678dbb683d8911f1ce97', 'fefe8e9ee335dadbace082923415e023', 'integralType', '积分类型', 'icon-standard-award-star-gold-2', '/do/integralType/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('0d6ca38f1d454978003bc83312a92266', '9f8578449c1035b20c35fbf1fcc72951', 'carrierCarInformation', '承运商车辆信息', 'icon-standard-car', '/do/carrierCarInformation/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('17752f099565a30aa90d48a4f13aa97a', 'cdf113348c5899a193a0edb40252fd7e', 'storehouseDamage', '货物损坏记录', 'icon-standard-dvd-delete', '/do/storehouseDamage/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('1da447eee943017b61e8da3c8acdc9ec', '9f8578449c1035b20c35fbf1fcc72951', 'carrierMemberGrade', '承运商信誉等级', 'icon-standard-award-star-gold-1', '/do/carrierMemberGrade/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('4a5f4f4c55665305938981a5f52d86ec', 'cdf113348c5899a193a0edb40252fd7e', 'storageGoodsrun', '货物流动记录', 'icon-standard-world-go', '/do/storageGoodsrun/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('4f1b6666b70be892469b6e93c1eb30ce', 'a60cca184eff20fdce88b3f1ab5a9cce', 'nav', '导航信息', 'icon-hamburg-category', '/do/nav/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('5185a2c89ccdd63fa82ab7804be04b27', '9f8578449c1035b20c35fbf1fcc72951', 'creditwortiness', '信誉记录', 'icon-standard-award-star-bronze-3', '/do/memberCreditwortiness/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('54d652799e07bb8be54483301a89ff90', 'a60cca184eff20fdce88b3f1ab5a9cce', 'help', '帮助中心', 'icon-hamburg-config', '/do/help/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('5b6eaabb2c3a020c4d85ab50d11ffd85', 'a60cca184eff20fdce88b3f1ab5a9cce', 'link', '友情链接', 'icon-hamburg-link', '/do/link/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('659b38abc076de53bb0620ba047b8b77', 'fefe8e9ee335dadbace082923415e023', 'bankCard', '会员银行卡管理', 'icon-standard-money-yen', '/do/memberBankCard/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('67c5fe81349c08664ac7f5032fbc0934', 'cdf113348c5899a193a0edb40252fd7e', 'storage', '仓库信息管理', 'icon-hamburg-home', '/do/storage/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('7c047a722ee223d015fe0b211134feed', 'cdf113348c5899a193a0edb40252fd7e', 'storageType', '仓库类型管理', 'icon-standard-application-home', '/do/storagetype/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('7d7c98a8eb32ff5412d26b3e8ebf1b18', '9f8578449c1035b20c35fbf1fcc72951', 'carrierContract', '承运商合同记录', 'icon-standard-table-multiple', '/do/carrierContract/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('88ee044d59911b3b1a67ba4cdd0ee90d', 'a60cca184eff20fdce88b3f1ab5a9cce', 'announcement', '公告管理', 'icon-hamburg-pencil', '/do/announcement/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('92548feb20b470297cf97b1af39c2512', 'fefe8e9ee335dadbace082923415e023', 'memberGrade', '货主会员等级', 'icon-hamburg-bestseller', '/do/shipperMemberGrade/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('9351ab194a4e54c2f1b3bc6ddf2bdfe4', 'fefe8e9ee335dadbace082923415e023', 'shipperMember', '货主会员信息', 'icon-standard-user-suit', '/do/shippermember/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('97ff81ae86c2e88f442e98df0ed22046', 'fefe8e9ee335dadbace082923415e023', 'contract', '会员合同记录', 'icon-standard-table-multiple', '/do/contract/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('9a4d2a8cec977fc35d08a08d1f325a7d', 'cdf113348c5899a193a0edb40252fd7e', 'storageRepair', '仓库维修管理', 'icon-standard-house-go', '/do/storageRepair/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('9c3c21783355119015ea6eff24d6773a', 'cdf113348c5899a193a0edb40252fd7e', 'goodsType', '货物类型', 'icon-hamburg-billing', '/do/goodstype/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('9c98de170d8569d8b39d656fa1e788ac', 'fefe8e9ee335dadbace082923415e023', 'memberIntegarl', '积分记录', 'icon-standard-award-star-gold-1', '/do/memberIntegral/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('9d9cc5684aa7dbf549d481d539fd3fe7', '14sdf54157cf483a790f4eea35dsf6f6', 'carrierCartype', '车辆类型管理', 'icon-standard-application-link', '/do/carrierCarType/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('9f8578449c1035b20c35fbf1fcc72951', null, '', '承运商管理', 'icon-standard-car', '', '4', '');
INSERT INTO `t_menu` VALUES ('a4144902eb68672fb147ef21d9470062', '9f8578449c1035b20c35fbf1fcc72951', 'carrierMember', '承运商信息', 'icon-hamburg-suppliers', '/do/carrierMember/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('a60cca184eff20fdce88b3f1ab5a9cce', null, 'website', '网站管理', 'icon-hamburg-world', '', '7', '');
INSERT INTO `t_menu` VALUES ('a652d3fe69c067cb94b73361351b8378', 'a60cca184eff20fdce88b3f1ab5a9cce', 'news', '新闻管理', 'icon-standard-monitor', '/do/news/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('ab01dd2ac38d920f691bbc65b7a4bfb2', 'a60cca184eff20fdce88b3f1ab5a9cce', 'hiring', '招聘信息', 'icon-hamburg-customers', '/do/hiring/index.htm', '8', '');
INSERT INTO `t_menu` VALUES ('abf160d979050ef082b2b2b53e967618', 'cdf113348c5899a193a0edb40252fd7e', 'packageType', '包装类型', 'icon-standard-package', '/do/packagetype/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-report-key', '/do/operalog/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('b34761b59816e63743643c6f179683a4', 'a60cca184eff20fdce88b3f1ab5a9cce', 'advertisement', '广告管理', 'icon-standard-tag-orange', '/do/advertisement/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('cdf113348c5899a193a0edb40252fd7e', null, 'storehouse', '仓库管理', 'icon-standard-house', '', '5', '');
INSERT INTO `t_menu` VALUES ('d2cb9b9c44425ca4f4bf4dd2c3062371', '9f8578449c1035b20c35fbf1fcc72951', 'carrierBankCard', '承运商银行卡信息', 'icon-standard-money-yen', '/do/carrierBankCard/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('de34654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'area', '地区管理', 'icon-hamburg-product', '/do/area/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('e1a79f5e3fe94e2e8fbe31fd6579ab9b', '9f8578449c1035b20c35fbf1fcc72951', 'carrierRoute', '班线管理', 'icon-standard-anchor', '/do/carrierRoute/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-report-edit', '/do/loginlog/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('e631330cc893bf752a63cb233a3510f4', 'cdf113348c5899a193a0edb40252fd7e', 'belaidup', '货物管理', 'icon-standard-box', '/do/belaidup/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('e75a41ba4a2bc299e3b50a15580a103b', 'a60cca184eff20fdce88b3f1ab5a9cce', 'service', '客服服务', 'icon-cologne-customers', '/do/service/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('fe60a1800397a1c7d62ad980adf7cedb', '14sdf54157cf483a790f4eea35dsf6f6', 'creditworthinessType', '信誉度类型管理', 'icon-hamburg-featured', '/do/creditworthinessType/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('fefe8e9ee335dadbace082923415e023', null, 'member_mgr', '会员管理', 'icon-standard-group', '', '3', '');
INSERT INTO `t_menu` VALUES ('sdsfeg4157cf483a790f4eea35ds5675', '14sdf54157cf483a790f4eea35dsf6f6', 'optgroup', '下拉项管理', 'icon-hamburg-sitemap', '/do/optgroup/index.htm', '2', '');

-- ----------------------------
-- Table structure for `t_operalog`
-- ----------------------------
DROP TABLE IF EXISTS `t_operalog`;
CREATE TABLE `t_operalog` (
  `operalog_id` varchar(32) NOT NULL COMMENT '主键',
  `opera_menu` varchar(255) default NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) default NULL COMMENT '操作面板',
  `opera_method` varchar(255) default NULL COMMENT '操作方法',
  `opera_result` varchar(255) default NULL COMMENT '操作结果',
  `opera_desc` varchar(1000) default NULL COMMENT '返回内容',
  `opera_class` varchar(255) default NULL COMMENT '调用类',
  `opera_md` varchar(255) default NULL COMMENT '调用方法',
  `opera_key` varchar(255) default NULL COMMENT '操作KEY',
  `operator` varchar(32) default NULL COMMENT '操作人',
  `opera_time` datetime default NULL COMMENT '操作世间',
  PRIMARY KEY  (`operalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operalog
-- ----------------------------
INSERT INTO `t_operalog` VALUES ('0133c91c94aeb287f579256eeeb0fc9a', '下拉项管理', '下拉列表', '修改', '1', '[返程车] 下拉项值信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-10-13 09:00:14');
INSERT INTO `t_operalog` VALUES ('01b100075087971d37e8bd3cdd79a566', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-16 13:19:54');
INSERT INTO `t_operalog` VALUES ('02e2aac3fcfe9c90027af8c2a4af13cc', '下拉项管理', '下拉列表', '增加', '1', '[登录] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-10 11:29:46');
INSERT INTO `t_operalog` VALUES ('0424c749bea9076af0a4100e42ff2825', '下拉项管理', '下拉项树', '增加', '1', '[仓库维修管理] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-17 14:12:31');
INSERT INTO `t_operalog` VALUES ('05a80db03e08c22909f8cc3038ea658e', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-16 13:17:22');
INSERT INTO `t_operalog` VALUES ('068a4015a3223ef439f8238dd8567923', '资源管理', '菜单树', '修改', '1', '[包装类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-20 11:05:17');
INSERT INTO `t_operalog` VALUES ('07d3d90068a6601040bded5b9a0a6e0f', '资源管理', '菜单树', '修改', '1', '[会银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:49:12');
INSERT INTO `t_operalog` VALUES ('07ede96e4f9e8cdcb213d470934ec7dc', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 21:19:35');
INSERT INTO `t_operalog` VALUES ('09211d1a367354f38698dd536c734776', '下拉项管理', '下拉列表', '增加', '1', '[封闭] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-16 16:00:08');
INSERT INTO `t_operalog` VALUES ('098ec46bfa8370b650d47574b675e24b', '资源管理', '操作列表', '增加', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:39:29');
INSERT INTO `t_operalog` VALUES ('0ba02030b86114eb53d5200fb8fad6f3', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-11 09:43:07');
INSERT INTO `t_operalog` VALUES ('0ba1975763c5b137b826d7663362c9a5', '资源管理', '面板列表', '增加', '1', '[包装类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-20 11:05:39');
INSERT INTO `t_operalog` VALUES ('0c4714509dd0187d80bb8b0ed9dfa5fb', '下拉项管理', '下拉列表', '增加', '1', '[等待分拣] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-22 09:45:34');
INSERT INTO `t_operalog` VALUES ('0d4516773c0659105bd8e6b5a0455c21', '下拉项管理', '下拉列表', '增加', '1', '[已维修] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:16:02');
INSERT INTO `t_operalog` VALUES ('0e246455e39a74397ae968f5f62c0911', '下拉项管理', '下拉列表', '增加', '1', '[整车] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 08:53:38');
INSERT INTO `t_operalog` VALUES ('0e2e4492eb869b4ec88ea6202dd8c804', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:53');
INSERT INTO `t_operalog` VALUES ('0f3e3931d5fa18f3d63a36c813f041f4', '资源管理', '菜单树', '修改', '1', '[积分类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 11:17:54');
INSERT INTO `t_operalog` VALUES ('0fc95e3d46882d2d2ea7b49b62b5ebc5', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:58');
INSERT INTO `t_operalog` VALUES ('103f6fccf7d016ce0f084a13c943967f', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 02:56:14');
INSERT INTO `t_operalog` VALUES ('107e7c462bad38eac9fba2df35be9c37', '下拉项管理', '下拉列表', '增加', '1', '[送货上门] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-22 09:42:59');
INSERT INTO `t_operalog` VALUES ('10a371d25f18220804f4b11d6a6da316', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 00:29:19');
INSERT INTO `t_operalog` VALUES ('110645f498419770bd35b4dda75b0397', '资源管理', '菜单树', '修改', '1', '[货物损坏记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-21 15:44:33');
INSERT INTO `t_operalog` VALUES ('123e88eaae91cbe41eb2c4fc2b17a659', '资源管理', '面板列表', '增加', '1', '[会员银行卡列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-09 17:45:37');
INSERT INTO `t_operalog` VALUES ('1286d9f62b1256916760d355c731bb33', '下拉项管理', '下拉列表', '增加', '1', '[收货入库] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 14:55:37');
INSERT INTO `t_operalog` VALUES ('12c01e3ef088cb85e506bb797e50fa82', '资源管理', '菜单树', '修改', '1', '[货主会员信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 11:18:00');
INSERT INTO `t_operalog` VALUES ('13001a0956329a09a4faff30b59993bb', '资源管理', '菜单树', '修改', '1', '[仓库信息管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-17 14:05:05');
INSERT INTO `t_operalog` VALUES ('1395ae5e10dc42d15771b01661e5c31a', '下拉项管理', '下拉列表', '增加', '1', '[半封闭] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-16 16:00:29');
INSERT INTO `t_operalog` VALUES ('151692cddb6811cf52c73314d4e9c66c', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 09:57:30');
INSERT INTO `t_operalog` VALUES ('1585d626bc95016224d6b63e7c3c9fe0', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-20 17:29:52');
INSERT INTO `t_operalog` VALUES ('1598b8c7a8ca1e0a3cf5d494206bcbeb', '下拉项管理', '下拉列表', '增加', '1', '[退货完成] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 14:57:03');
INSERT INTO `t_operalog` VALUES ('16d9d16ba39f9e1bde714dfe11d73a7b', '下拉项管理', '下拉项树', '增加', '1', '[积分类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-10 11:29:03');
INSERT INTO `t_operalog` VALUES ('17cce2f3fb20546964b82e7908643d07', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:08:48');
INSERT INTO `t_operalog` VALUES ('191615b007c40d57a50dcae925999729', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 08:46:31');
INSERT INTO `t_operalog` VALUES ('1b21ef30dec0cc87cbb560f5033f8a4a', '资源管理', '面板列表', '增加', '1', '[承运商合同列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-12 23:56:37');
INSERT INTO `t_operalog` VALUES ('1bc49c99449ca76557e3d4414512767f', '下拉项管理', '下拉列表', '增加', '1', '[上门取货] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-22 09:42:45');
INSERT INTO `t_operalog` VALUES ('1be85b7d5f09d6632b461423225f19f1', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-17 14:16:50');
INSERT INTO `t_operalog` VALUES ('1c36b6caac8415d27d7bea07a812b6da', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-16 13:40:36');
INSERT INTO `t_operalog` VALUES ('1c97fc76666299189b44901eefdd397e', '资源管理', '操作列表', '增加', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 18:02:06');
INSERT INTO `t_operalog` VALUES ('1d019dc65ca2e7f86f960f4ad5da3c36', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:03');
INSERT INTO `t_operalog` VALUES ('1d7204453d1b1b7fa7b5b0c76f40628c', '下拉项管理', '下拉项树', '增加', '1', '[是否] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-17 14:10:13');
INSERT INTO `t_operalog` VALUES ('1e06850be0ac39fe116ec19b18e4f792', '下拉项管理', '下拉项树', '删除', '0', '该下拉项存在所属下拉值，如需删除请先删除所属下拉值', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-10-22 09:51:29');
INSERT INTO `t_operalog` VALUES ('1e216cfb8a74bb6e9361c6ffb5b23540', '资源管理', '面板列表', '增加', '1', '[班线管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-16 13:38:30');
INSERT INTO `t_operalog` VALUES ('1ea4c0b416ea6342edc26191c9cbca93', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-21 22:39:20');
INSERT INTO `t_operalog` VALUES ('1fec8f6b4d0a0afe4214c14212d95e42', '资源管理', '菜单树', '修改', '1', '[承运商信誉等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:22');
INSERT INTO `t_operalog` VALUES ('20bf6c6de71988f7efc153c588def3ac', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:29:07');
INSERT INTO `t_operalog` VALUES ('20d32a1d7aa2a4c615f8a2042b65f722', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:39:40');
INSERT INTO `t_operalog` VALUES ('218453d9652bd2a77a56acdb5a552689', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 13:38:42');
INSERT INTO `t_operalog` VALUES ('2251a0602dc4a8296a02aae00598098d', '资源管理', '操作列表', '增加', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-16 13:42:04');
INSERT INTO `t_operalog` VALUES ('22b706a31f77a86b313f54bad1b76ec2', '下拉项管理', '下拉列表', '增加', '1', '[零装] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 08:53:56');
INSERT INTO `t_operalog` VALUES ('22f194326d9f264b131f6a5097a165c2', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 13:44:28');
INSERT INTO `t_operalog` VALUES ('236212d799e64a1e7976339fe31e5636', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 11:06:31');
INSERT INTO `t_operalog` VALUES ('24965731cbc51837fa51722f187a533f', '下拉项管理', '下拉项树', '修改', '1', '[运送类型] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:55:02');
INSERT INTO `t_operalog` VALUES ('2564a5743fd8331442554a7ed736ba7f', '资源管理', '面板列表', '增加', '1', '[仓库类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-15 15:52:46');
INSERT INTO `t_operalog` VALUES ('271477e58a7174bfacfe4bcd926f66c3', '下拉项管理', '下拉项树', '修改', '1', '[承运商车辆信息] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:54:48');
INSERT INTO `t_operalog` VALUES ('2715925966d6dcb5c04b0fd7557b5bff', '资源管理', '操作列表', '增加', '1', '[添加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:36:08');
INSERT INTO `t_operalog` VALUES ('2946ec0ed4aa47906163e10d02556acf', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:10:06');
INSERT INTO `t_operalog` VALUES ('295e5e02357b6bb2fa39db52c30a98c9', '资源管理', '面板列表', '增加', '1', '[车辆类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-14 13:25:05');
INSERT INTO `t_operalog` VALUES ('2b25645f2ce254ae6cd916fadec683d3', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-22 09:49:59');
INSERT INTO `t_operalog` VALUES ('2c5ad6622ab0913572ed15f043b948eb', '资源管理', '操作列表', '增加', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-12 23:57:17');
INSERT INTO `t_operalog` VALUES ('2c5e5c79d877f32ddc0bb76dd4d12df2', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:28:47');
INSERT INTO `t_operalog` VALUES ('2db5b5cf30ba7a20b2a150ca3deb7203', '资源管理', '菜单树', '修改', '1', '[承运商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 10:17:06');
INSERT INTO `t_operalog` VALUES ('2dcc81856fe20db0a5d26558b9cb739f', '资源管理', '操作列表', '编辑', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-15 09:40:44');
INSERT INTO `t_operalog` VALUES ('2ea91fb7f4393c047fa190e60f6606ba', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 17:01:29');
INSERT INTO `t_operalog` VALUES ('2ef1b3f9c1f863f8ca2514aea8d0b65d', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-16 16:59:48');
INSERT INTO `t_operalog` VALUES ('2f7bc6965daa6e257b92e86f61cad260', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:54:59');
INSERT INTO `t_operalog` VALUES ('2f9950ab6e407cfc5a5aca0c8a753695', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-17 14:19:40');
INSERT INTO `t_operalog` VALUES ('2fb057ee2affa60a2f92dca8fe32c15b', '下拉项管理', '下拉列表', '增加', '1', '[未维修] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:15:45');
INSERT INTO `t_operalog` VALUES ('308cad64f202758d95a6e5d8173688a2', '下拉项管理', '下拉列表', '增加', '1', '[申请退货] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 15:55:33');
INSERT INTO `t_operalog` VALUES ('31282276126d82a9bcb315e4d2f04659', '下拉项管理', '下拉项树', '增加', '1', '[承运商车辆信息] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 08:53:04');
INSERT INTO `t_operalog` VALUES ('31d8fbe01bb5e572e7d895e80ace3cd6', '资源管理', '菜单树', '增加', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 15:24:23');
INSERT INTO `t_operalog` VALUES ('32fe4b13a8f1a804993165ec85d90073', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 16:37:25');
INSERT INTO `t_operalog` VALUES ('3482c5ed3350d924914bb29ff5e4efd2', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 14:47:06');
INSERT INTO `t_operalog` VALUES ('348a5b12de581d5d26523bd3617f3364', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 00:28:38');
INSERT INTO `t_operalog` VALUES ('34a082620aeed48019279c24655e8a85', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:26:26');
INSERT INTO `t_operalog` VALUES ('3561de85f1916463787b40c64dc76d5f', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-20 11:07:32');
INSERT INTO `t_operalog` VALUES ('36d4c929c767586dc3f36843b5931f7a', '资源管理', '面板列表', '增加', '1', '[仓库信息列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-17 14:05:29');
INSERT INTO `t_operalog` VALUES ('37f038acdced64377830d09e1e5a6204', '下拉项管理', '下拉列表', '增加', '1', '[运输中] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:24');
INSERT INTO `t_operalog` VALUES ('381cf230a471bcfae45f829d9531912a', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:46');
INSERT INTO `t_operalog` VALUES ('3a6c3bcb292c44128947c3d8da07b393', '资源管理', '菜单树', '增加', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-11 10:19:06');
INSERT INTO `t_operalog` VALUES ('3bb0f87586899e64215c4aebb0203d3c', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 17:29:39');
INSERT INTO `t_operalog` VALUES ('42e36bdef8403c5303560ecbffa498ae', '资源管理', '菜单树', '增加', '1', '[车辆类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 13:24:42');
INSERT INTO `t_operalog` VALUES ('46bc9494fef9c015a7376e1ffd2203e4', '下拉项管理', '下拉列表', '增加', '1', '[返程车] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 08:59:36');
INSERT INTO `t_operalog` VALUES ('47a2ea166d75f06be56cb55627f75cdc', '下拉项管理', '下拉项树', '增加', '1', '[仓库管理] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-17 14:11:10');
INSERT INTO `t_operalog` VALUES ('48ef7840f169471ba1b13c44f167e1db', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 13:44:12');
INSERT INTO `t_operalog` VALUES ('4b4ef517d4c873c4038ae643579c355e', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:28');
INSERT INTO `t_operalog` VALUES ('4c0e02163dd18bd2b7aa7bcf036a86d2', '资源管理', '面板列表', '增加', '1', '[承运商车辆信息列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-13 08:42:09');
INSERT INTO `t_operalog` VALUES ('4d960172b437b9b8d41571c4e14c172e', '下拉项管理', '下拉列表', '增加', '1', '[出库运输] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 14:56:17');
INSERT INTO `t_operalog` VALUES ('4e530090604a13bb328e89e04172aa0d', '资源管理', '菜单树', '增加', '1', '[货物损坏记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-21 15:43:56');
INSERT INTO `t_operalog` VALUES ('53e3ac8e442c41aa96cf91d5a9da0874', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:08:19');
INSERT INTO `t_operalog` VALUES ('542503557f57d9d15aaca49088ef32fa', '资源管理', '菜单树', '增加', '1', '[会银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-09 17:44:26');
INSERT INTO `t_operalog` VALUES ('54635749f38cca148f1a69bf87d1e52a', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 11:07:24');
INSERT INTO `t_operalog` VALUES ('54ae6c996218ea7a2bd1e09ceea1bb58', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-17 14:08:56');
INSERT INTO `t_operalog` VALUES ('55256cf9b93daea83344014a63f10048', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-12 23:59:17');
INSERT INTO `t_operalog` VALUES ('559049021eb45cd56194608931d592cb', '资源管理', '菜单树', '增加', '1', '[仓库类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-15 15:52:23');
INSERT INTO `t_operalog` VALUES ('55f5a320aedb39e3baedee9bdb0c716f', '资源管理', '菜单树', '修改', '1', '[货物损坏记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-21 15:44:18');
INSERT INTO `t_operalog` VALUES ('56206adacbef045ac6e443a80e04439d', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-17 14:06:01');
INSERT INTO `t_operalog` VALUES ('5659b685f16c1e0f32cfe1a6ea87c182', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-11 09:42:03');
INSERT INTO `t_operalog` VALUES ('57bced1c720ac1f8974fded9972fad3e', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:28:09');
INSERT INTO `t_operalog` VALUES ('59aa8b96cad4394bbb3f0c203167de51', '下拉项管理', '下拉项树', '增加', '1', '[货物损坏记录] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-21 15:54:14');
INSERT INTO `t_operalog` VALUES ('5c3678321e5caa821e18f47349325cb8', '资源管理', '操作列表', '增加', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-11 16:16:09');
INSERT INTO `t_operalog` VALUES ('5c66ed1f548a315d710f246d00a52076', '资源管理', '菜单树', '增加', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-09 17:34:47');
INSERT INTO `t_operalog` VALUES ('5d9333c74313948eb00f101234fef838', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-21 22:39:38');
INSERT INTO `t_operalog` VALUES ('5e645a26af9be63c78a6ec93273edbf2', '资源管理', '菜单树', '修改', '1', '[承运商银行卡信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:14');
INSERT INTO `t_operalog` VALUES ('5fea5b770aeeaf9a35dc8465c6120115', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:03');
INSERT INTO `t_operalog` VALUES ('606a1979c4ccf9e7b05cd34ecbaf350c', '资源管理', '菜单树', '增加', '1', '[货物管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-22 09:38:03');
INSERT INTO `t_operalog` VALUES ('6271a9ab3b0b9078accf096ef5a00d80', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 11:06:59');
INSERT INTO `t_operalog` VALUES ('63afc2da4d28b953cdcefe154985563f', '资源管理', '操作列表', '增加', '1', '[企业认证] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 17:03:06');
INSERT INTO `t_operalog` VALUES ('6417553508f7f3c787b66d44a88a6fbd', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-17 14:06:24');
INSERT INTO `t_operalog` VALUES ('644cb16bb04f0295ae2abf77efebe789', '下拉项管理', '下拉项树', '增加', '1', '[货物管理] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-22 09:41:49');
INSERT INTO `t_operalog` VALUES ('6731f9f550158883666642293c9e86c7', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-21 22:45:41');
INSERT INTO `t_operalog` VALUES ('67327d0c3e45c2b0f974eaa1c6e33988', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 10:19:41');
INSERT INTO `t_operalog` VALUES ('677bd3d0210e3ef4ee74c6e9c977dab9', '资源管理', '面板列表', '增加', '1', '[仓库维修列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-17 14:08:21');
INSERT INTO `t_operalog` VALUES ('688552013cfd76d37f04e6aaff9c9c20', '下拉项管理', '下拉项树', '增加', '1', '[箱型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-16 15:59:03');
INSERT INTO `t_operalog` VALUES ('69e0d1362cc0a76076a7b613aab128df', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-16 13:42:23');
INSERT INTO `t_operalog` VALUES ('6a76b9c07629069ab983af901fa0febb', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 16:36:28');
INSERT INTO `t_operalog` VALUES ('6b36482c369cde63bc1192e529e0dcf4', '下拉项管理', '下拉列表', '增加', '1', '[中等] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:14:29');
INSERT INTO `t_operalog` VALUES ('6d2ea18c4ece2fdbb811985bf6a90338', '资源管理', '面板列表', '增加', '1', '[合同类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-09 17:35:24');
INSERT INTO `t_operalog` VALUES ('6efb5e5c5b89127de610e0d588e9a7b5', '资源管理', '面板列表', '增加', '1', '[货物流动记录列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-21 14:42:03');
INSERT INTO `t_operalog` VALUES ('6f49ed9ecb1de1c6c0db51b5894ee6e7', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 09:57:06');
INSERT INTO `t_operalog` VALUES ('6fa232fb0d0ce90e38f235341bcfdfa1', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:57');
INSERT INTO `t_operalog` VALUES ('70914cacc2422c6e71d594eb70a0a6d5', '资源管理', '面板列表', '增加', '1', '[承运商银行卡列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-12 23:57:57');
INSERT INTO `t_operalog` VALUES ('713bf022689e6b70b005acecaf28eced', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 15:52:03');
INSERT INTO `t_operalog` VALUES ('718760637d37b10c4667db94a0b5f49e', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:49:01');
INSERT INTO `t_operalog` VALUES ('74f037068fd5a6a20aa63c8955a6c07b', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:26:45');
INSERT INTO `t_operalog` VALUES ('74fb679d76cb8ac3b1af1ccdd67348ac', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:36:14');
INSERT INTO `t_operalog` VALUES ('7616f071345e4c247e96a99fd122b5d1', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 15:49:03');
INSERT INTO `t_operalog` VALUES ('78afcbd2326d7e48869ae9c87184b3b0', '资源管理', '面板列表', '增加', '1', '[货主会员等级列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-10 14:46:17');
INSERT INTO `t_operalog` VALUES ('78f9e3a3327f230e67aadd1535114435', '下拉项管理', '下拉列表', '增加', '1', '[平板] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-16 16:00:57');
INSERT INTO `t_operalog` VALUES ('7a1ec9fb3b588cdc8553bfc995ec4e11', '资源管理', '操作列表', '增加', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 09:40:25');
INSERT INTO `t_operalog` VALUES ('7ae944cd37e636005d91def72543a7d2', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-20 09:58:02');
INSERT INTO `t_operalog` VALUES ('7b47192b240c663baf4e365c08be0b99', '资源管理', '菜单树', '修改', '1', '[地区管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:40');
INSERT INTO `t_operalog` VALUES ('7e126ec873390c9d2d225392b74733e3', '资源管理', '菜单树', '修改', '1', '[合同类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:40:19');
INSERT INTO `t_operalog` VALUES ('7e5f8dd4d610c4eba146d1e2c0727a06', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-17 14:09:22');
INSERT INTO `t_operalog` VALUES ('7e9636ff149088c7dc0910d40e201d53', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-10 14:48:21');
INSERT INTO `t_operalog` VALUES ('7f28c65ee954c3220f7c36903ec90bd0', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 13:26:08');
INSERT INTO `t_operalog` VALUES ('7fbae4b6780cc04913b08dce9c00daee', '下拉项管理', '下拉项树', '修改', '1', '[承运商管理] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:51:12');
INSERT INTO `t_operalog` VALUES ('7fd132b71df1e6e7268331c0e0aeec71', '资源管理', '菜单树', '增加', '1', '[承运商车辆信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-13 08:41:36');
INSERT INTO `t_operalog` VALUES ('809e45331647be0ef4fe4902a144e9b2', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-14 13:26:46');
INSERT INTO `t_operalog` VALUES ('81e0998a6bce69ffa1b65bfabcf1173e', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-17 14:06:55');
INSERT INTO `t_operalog` VALUES ('822b35c49770a42e8cc8d022a0080a3a', '下拉项管理', '下拉项树', '删除', '1', '[货物损坏记录] 下拉项信息已删除', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-10-22 09:51:35');
INSERT INTO `t_operalog` VALUES ('85c0300cadfdd50e4d7541b15971ce4d', '资源管理', '菜单树', '增加', '1', '[货物类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-20 09:55:33');
INSERT INTO `t_operalog` VALUES ('85d6754b401d2cfe0e21e92277f8befe', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 16:36:00');
INSERT INTO `t_operalog` VALUES ('85e71cf0e792882ce270672f35dd2cb9', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 15:50:26');
INSERT INTO `t_operalog` VALUES ('86095896ff2a6c6319fc522a9d3e7621', '资源管理', '面板列表', '增加', '1', '[信誉度类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-14 16:35:25');
INSERT INTO `t_operalog` VALUES ('86f6a7c6e3d4ad273f39bb3b355851ec', '资源管理', '菜单树', '修改', '1', '[积分类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 13:09:27');
INSERT INTO `t_operalog` VALUES ('87b6637368b1f0c5b5719fc851d0fac3', '下拉项管理', '下拉项树', '修改', '1', '[车辆运输状态] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 09:08:45');
INSERT INTO `t_operalog` VALUES ('87c024bf9caae2afa90e5e1fa37746d1', '资源管理', '面板列表', '增加', '1', '[货物类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-20 09:56:03');
INSERT INTO `t_operalog` VALUES ('87fa7fe1dad6d5984030efcd004f11e6', '资源管理', '操作列表', '增加', '1', '[企业认证] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 17:00:06');
INSERT INTO `t_operalog` VALUES ('880b2b178d3c1662b858fd6be0798156', '资源管理', '菜单树', '修改', '1', '[会银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:47:43');
INSERT INTO `t_operalog` VALUES ('882c78c3d2e9d5c7cf5a08da214e5c46', '资源管理', '面板列表', '增加', '1', '[承运商列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-11 16:14:26');
INSERT INTO `t_operalog` VALUES ('892f2f04e40a4feee5776b92efc997be', '下拉项管理', '下拉项树', '修改', '1', '[车辆运输状态] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 10:21:38');
INSERT INTO `t_operalog` VALUES ('8a97eec62f5c6ef53ca1f32e6fb68771', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 08:44:41');
INSERT INTO `t_operalog` VALUES ('8ef896e5b8ebd08f95335958ff251ffb', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:38:50');
INSERT INTO `t_operalog` VALUES ('8f087755cefed0001a52e7517d1f6fff', '下拉项管理', '下拉列表', '增加', '1', '[一般] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:14:47');
INSERT INTO `t_operalog` VALUES ('8fd5a316ddb5a08315dd52d8455f2e22', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:38:10');
INSERT INTO `t_operalog` VALUES ('90f43da3e3c3d8848326acd3bf3b92c7', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 15:54:39');
INSERT INTO `t_operalog` VALUES ('9170d349edc121e28f9dc3ea1bce0689', '资源管理', '菜单树', '增加', '1', '[仓库维修管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-17 14:08:01');
INSERT INTO `t_operalog` VALUES ('9176a8e5913c6fc34878f56c96925486', '资源管理', '操作列表', '增加', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-21 14:43:47');
INSERT INTO `t_operalog` VALUES ('917e99aa13e0d80296aabeabd4c9377a', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 16:17:21');
INSERT INTO `t_operalog` VALUES ('919c9debc3dd18f2b60f5338bb510dbb', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-14 15:27:14');
INSERT INTO `t_operalog` VALUES ('93cb99c615b4ab8ddc49baac665e2f98', '下拉项管理', '下拉项树', '修改', '1', '[承运商管理] 下拉项信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-10-13 08:51:51');
INSERT INTO `t_operalog` VALUES ('96e7e38235cb23016078462e20e20c19', '下拉项管理', '下拉列表', '增加', '1', '[待调动] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:08');
INSERT INTO `t_operalog` VALUES ('9a2084e4ce667ec69b30c77ffcb9ce37', '资源管理', '面板列表', '增加', '1', '[会员合同列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-09 17:59:50');
INSERT INTO `t_operalog` VALUES ('9b7ea8d6063d6f981ddc54ea4de60ed6', '下拉项管理', '下拉列表', '增加', '1', '[海运] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-16 16:02:42');
INSERT INTO `t_operalog` VALUES ('9be4229a0fba67956dcb0b3271256c8e', '下拉项管理', '下拉列表', '增加', '1', '[否] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:10:39');
INSERT INTO `t_operalog` VALUES ('9c20e99ce87d767fd5aee0b37850bafa', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 10:16:31');
INSERT INTO `t_operalog` VALUES ('9c25f8b93e2061eab926fa81432207d7', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 15:26:27');
INSERT INTO `t_operalog` VALUES ('9cc44a0c3d7b6432eae2a4eccdcd8b55', '下拉项管理', '下拉列表', '增加', '1', '[交易完成] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 14:57:37');
INSERT INTO `t_operalog` VALUES ('9cd09dc4f4944f2b3b3082d8ef342fac', '资源管理', '菜单树', '修改', '1', '[信誉记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:26:46');
INSERT INTO `t_operalog` VALUES ('9ded65bcb95d726eb3bf4faabd55ca52', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 17:04:01');
INSERT INTO `t_operalog` VALUES ('9e65b0e2a7cf78659f539e9faae9b02f', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 18:02:18');
INSERT INTO `t_operalog` VALUES ('9fb01a83749f243da465799a61fd9d60', '下拉项管理', '下拉项树', '增加', '1', '[严重程度] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-17 14:13:39');
INSERT INTO `t_operalog` VALUES ('9fb88bd3a2f7b251a88516b036a43bb0', '下拉项管理', '下拉列表', '增加', '1', '[维修中] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:38');
INSERT INTO `t_operalog` VALUES ('9fba40475ecacaa1ab4c978f13b81af4', '资源管理', '菜单树', '修改', '1', '[承运商银行卡信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:31');
INSERT INTO `t_operalog` VALUES ('a0c63f7f528b7a1cf948be90973a7cc6', '资源管理', '菜单树', '增加', '1', '[积分类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-10 11:17:22');
INSERT INTO `t_operalog` VALUES ('a18d1888f3a03ad5f31926de22a1eff0', '资源管理', '菜单树', '修改', '1', '[货物流动记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-21 15:44:28');
INSERT INTO `t_operalog` VALUES ('a1d9109da5b0ff84e3175932adcfa178', '下拉项管理', '下拉项树', '增加', '1', '[班线类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-16 16:01:43');
INSERT INTO `t_operalog` VALUES ('a221301b370105349a04542e770322a6', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:21');
INSERT INTO `t_operalog` VALUES ('a22606a0c6f8d1dad686e2859dd688ba', '资源管理', '面板列表', '修改', '1', '[会员合同列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-10-09 21:14:26');
INSERT INTO `t_operalog` VALUES ('a258156f86e86bb1bfa483bd9baada67', '下拉项管理', '下拉项树', '增加', '1', '[承运商管理] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 08:50:45');
INSERT INTO `t_operalog` VALUES ('a28d11478b4e584d84d80d101135602e', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-21 15:45:01');
INSERT INTO `t_operalog` VALUES ('a3dd91caa4f66a7a3f8759004376f361', '资源管理', '面板列表', '修改', '1', '[承运商列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-10-11 16:16:54');
INSERT INTO `t_operalog` VALUES ('a46c5226c13f8227b763c4070afd86a8', '下拉项管理', '下拉项树', '增加', '1', '[改变类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-10 11:30:52');
INSERT INTO `t_operalog` VALUES ('a48bf7740fea1345e7e8b74480b9a178', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-20 10:00:56');
INSERT INTO `t_operalog` VALUES ('a4e7c3586fa2bb2588bcf170f7cffcb5', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 15:49:41');
INSERT INTO `t_operalog` VALUES ('a593f537aefcde63b9e7b78010df33ce', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-20 17:30:11');
INSERT INTO `t_operalog` VALUES ('a7eb447547d683dd2c95b8cda87c2845', '资源管理', '菜单树', '修改', '1', '[仓库管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-17 14:04:57');
INSERT INTO `t_operalog` VALUES ('a872a22fdfa1f1ae35742a38ebb48d6f', '资源管理', '操作列表', '增加', '1', '[打印] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-16 17:38:11');
INSERT INTO `t_operalog` VALUES ('ac3f9fd543aacb5720822a8fd2de10cc', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 13:25:46');
INSERT INTO `t_operalog` VALUES ('ad549b2b5c17e60ce294f97bda79d3ae', '下拉项管理', '下拉列表', '增加', '1', '[增加] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-10 11:31:15');
INSERT INTO `t_operalog` VALUES ('adf19e058c95bc88b3811ac4756aa4ed', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:27');
INSERT INTO `t_operalog` VALUES ('ae04f9a25842176e4c3e30450ff20ed5', '下拉项管理', '下拉项树', '增加', '1', '[信誉类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-14 15:30:07');
INSERT INTO `t_operalog` VALUES ('b02797f091671414b259d26d91a340e0', '资源管理', '菜单树', '增加', '1', '[班线管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-16 13:18:50');
INSERT INTO `t_operalog` VALUES ('b0c54da5b478ca2f0b8a67ffefc816db', '下拉项管理', '下拉列表', '修改', '1', '[增加] 下拉项值信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-10-10 11:31:21');
INSERT INTO `t_operalog` VALUES ('b272835ca532fc441b7f543345e05c6e', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 15:50:11');
INSERT INTO `t_operalog` VALUES ('b34909b26c28b6c801a8e298e466490b', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 不申请退货,申请退货 ]下拉值', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-10-22 09:51:32');
INSERT INTO `t_operalog` VALUES ('b36a0c9eddf34c73124e74b2f6e05087', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 08:44:13');
INSERT INTO `t_operalog` VALUES ('b4bf5dec3fc8f6d748b7613fe9489389', '资源管理', '菜单树', '增加', '1', '[包装类型] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-20 11:05:06');
INSERT INTO `t_operalog` VALUES ('b6608943a60b882228cf5d2947b27eee', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:36');
INSERT INTO `t_operalog` VALUES ('b66584a35ebb5760dfacdbbb84d7a9a5', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 15:49:34');
INSERT INTO `t_operalog` VALUES ('b794415827705297495868a533fca97f', '资源管理', '面板列表', '增加', '1', '[货物管理列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-22 09:38:30');
INSERT INTO `t_operalog` VALUES ('b7c28723ea84f1ce433ae57bda24aaea', '新闻管理', '新闻列表', '修改', '1', '[十五年一遇的双情人节，大家准备好了吗？] 新闻信息已修改', 'com.glacier.frame.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-10-13 09:32:41');
INSERT INTO `t_operalog` VALUES ('b815dde13dcd924c541c6f1bc8d0a7d8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 21:15:10');
INSERT INTO `t_operalog` VALUES ('b8adc4b3211204a95772e2641a3b8165', '资源管理', '面板列表', '增加', '1', '[货物损坏记录列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-21 22:38:23');
INSERT INTO `t_operalog` VALUES ('ba65744dfc6a888dd31a1e6d1d455ee2', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 15:26:34');
INSERT INTO `t_operalog` VALUES ('bb0324f283e1351cd35da30a847f03e8', '资源管理', '菜单树', '修改', '1', '[下拉项管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:36');
INSERT INTO `t_operalog` VALUES ('bc29bb0cba153acf12d67d8ea4e6c35e', '资源管理', '菜单树', '增加', '1', '[承运商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-11 10:15:54');
INSERT INTO `t_operalog` VALUES ('bc851cbcf2294acf5ad9a573b9e6c5fb', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:55:14');
INSERT INTO `t_operalog` VALUES ('bd26490fa3c89b742b3b24dc938c843d', '下拉项管理', '下拉项树', '增加', '1', '[货物状态] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-21 14:54:39');
INSERT INTO `t_operalog` VALUES ('bd399e0eaa9a832a0d8a00c30d1da3b6', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-17 14:09:44');
INSERT INTO `t_operalog` VALUES ('bda0f2b90c1ee7802e848e897570d30a', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 15:54:05');
INSERT INTO `t_operalog` VALUES ('bdac93f3147e98a21cc878184195917e', '资源管理', '菜单树', '增加', '1', '[仓库管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-15 15:51:31');
INSERT INTO `t_operalog` VALUES ('bee95ff93b3c3172237c190bf044bef4', '下拉项管理', '下拉列表', '增加', '1', '[申请退货] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 14:56:37');
INSERT INTO `t_operalog` VALUES ('bf2ef8cc915798d24f195bedfb844648', '资源管理', '菜单树', '增加', '1', '[承运商信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-11 13:53:16');
INSERT INTO `t_operalog` VALUES ('bf6565500a57f1ba1856bdf6cb3b2573', '资源管理', '菜单树', '增加', '1', '[信誉度类型管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 16:35:06');
INSERT INTO `t_operalog` VALUES ('bff9291690196d8d125e67333db1f8c3', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-10 12:36:38');
INSERT INTO `t_operalog` VALUES ('c0b261d6e6568862551720199218b165', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 09:09:21');
INSERT INTO `t_operalog` VALUES ('c0e92bc4258532cc2e942186ab2825ad', '下拉项管理', '下拉列表', '增加', '1', '[减少] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-10 13:37:10');
INSERT INTO `t_operalog` VALUES ('c23f17de457fefc35c2a652a0112ddad', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 08:45:11');
INSERT INTO `t_operalog` VALUES ('c2c49cb58cc25db1815c4731dfa96aee', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-16 17:38:25');
INSERT INTO `t_operalog` VALUES ('c30534f02fbc5297006a5598136ad2e0', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-14 13:26:28');
INSERT INTO `t_operalog` VALUES ('c30fe9bbb862c2363b9620ddfdd9e746', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 14:47:48');
INSERT INTO `t_operalog` VALUES ('c3141f7b13ed3b9221af0861bba6a18c', '下拉项管理', '下拉列表', '增加', '1', '[回途中] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 14:57:58');
INSERT INTO `t_operalog` VALUES ('c3412aa696b8e3f187c12c04c84d910a', '下拉项管理', '下拉项树', '增加', '1', '[服务类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 08:58:50');
INSERT INTO `t_operalog` VALUES ('c38cdadfe01a9d82f87c55e2c4e4b27a', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:54:13');
INSERT INTO `t_operalog` VALUES ('c435cd76cf169922af68fa0a2e03aec8', '资源管理', '面板列表', '增加', '1', '[承运商信誉等级列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-13 15:48:10');
INSERT INTO `t_operalog` VALUES ('c4b317b62e98f33447409f7a344237aa', '资源管理', '菜单树', '增加', '1', '[信誉记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-14 15:26:15');
INSERT INTO `t_operalog` VALUES ('c51bd35c8e814f6a727b8aff54ea7793', '资源管理', '菜单树', '修改', '1', '[承运商管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-11 10:17:18');
INSERT INTO `t_operalog` VALUES ('c544bb1737268bdd9a0fe15fc2d3e00c', '下拉项管理', '下拉列表', '增加', '1', '[不申请退货] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-21 15:55:12');
INSERT INTO `t_operalog` VALUES ('c58b0c8f29bc0821ce2fbfb4b6f904e4', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-09 17:46:33');
INSERT INTO `t_operalog` VALUES ('c67bec3aaf34b06f0747ec752a3f96e5', '资源管理', '菜单树', '修改', '1', '[会员银行卡管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-10 02:56:21');
INSERT INTO `t_operalog` VALUES ('c6c8e9deaefa0a095218095da5681b00', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:46:50');
INSERT INTO `t_operalog` VALUES ('c7134a92c638fac637e1e5b1aafd4a5e', '下拉项管理', '下拉项树', '增加', '1', '[分拣状态] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-22 09:45:19');
INSERT INTO `t_operalog` VALUES ('c9d8b70f663f22fdc1e9eabd75a70351', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 14:48:09');
INSERT INTO `t_operalog` VALUES ('c9f8e99f6d270b6ee6995177eaaa0b66', '资源管理', '菜单树', '修改', '1', '[货主会员等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:34:49');
INSERT INTO `t_operalog` VALUES ('ca4fc2e7d56c7a1e51dc56c8fc77024d', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-13 15:26:56');
INSERT INTO `t_operalog` VALUES ('cac3d27caab9f633817e8f0b589e0a38', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-14 13:27:36');
INSERT INTO `t_operalog` VALUES ('cb71a34e5e8e4264bb0e6ffcfe31aef4', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:49:24');
INSERT INTO `t_operalog` VALUES ('ccb1f7f6dd574af98872085ac8b420c1', '资源管理', '菜单树', '增加', '1', '[货主会员等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-10 14:45:44');
INSERT INTO `t_operalog` VALUES ('cd57c7c90bdeac103e528914c300b8b5', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-13 00:27:44');
INSERT INTO `t_operalog` VALUES ('ce28f35e929922bfd0f9c25a512a458f', '下拉项管理', '下拉列表', '增加', '1', '[严重] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:14:01');
INSERT INTO `t_operalog` VALUES ('ceacd9198a1d7b3d7c28d2f84ade54e8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-11 13:53:45');
INSERT INTO `t_operalog` VALUES ('cf604a42b3449dd84b8472cf7e41b005', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 12:34:40');
INSERT INTO `t_operalog` VALUES ('cf7eb083518df1eb877d874dde9e57c0', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-20 09:57:54');
INSERT INTO `t_operalog` VALUES ('cfc2dde7bbec14ca4c481cb49add35b7', '下拉项管理', '下拉项树', '增加', '0', '下拉项名称重复', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-22 09:43:38');
INSERT INTO `t_operalog` VALUES ('d028a58f9521c5af1b7d0539ea7d764d', '资源管理', '菜单树', '增加', '1', '[承运商银行卡信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-12 23:54:56');
INSERT INTO `t_operalog` VALUES ('d215213fe9b3bcb01a53cec3c3c3126b', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 00:31:38');
INSERT INTO `t_operalog` VALUES ('d610c48db63774cb71787120880ae457', '下拉项管理', '下拉列表', '增加', '1', '[已分拣] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-22 09:45:48');
INSERT INTO `t_operalog` VALUES ('d7144b2afa255eca258842b394a7ef4d', '下拉项管理', '下拉项树', '增加', '1', '[货物流动记录] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-21 14:53:52');
INSERT INTO `t_operalog` VALUES ('d86617341a77e225520c6be55dd1f5eb', '下拉项管理', '下拉项树', '增加', '1', '[车辆类型] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-13 09:05:34');
INSERT INTO `t_operalog` VALUES ('d9235d605b8d5f169e638fd4683a18be', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-22 09:39:10');
INSERT INTO `t_operalog` VALUES ('d9cb89b949cc7c41ac01db017303c399', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:41');
INSERT INTO `t_operalog` VALUES ('ddb4aec6c975d5b9212d2ae7f8592b93', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-09 17:55:27');
INSERT INTO `t_operalog` VALUES ('de8fb795225118c5008126721d5e74cd', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 12:36:21');
INSERT INTO `t_operalog` VALUES ('df4999c7c526171316950dc6c265b568', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-22 09:40:01');
INSERT INTO `t_operalog` VALUES ('df5f7817b5edae6e3b9471e530011440', '下拉项管理', '下拉列表', '增加', '1', '[是] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-17 14:10:27');
INSERT INTO `t_operalog` VALUES ('dfe6c81c43ba200d0c6f4512351f9741', '资源管理', '菜单树', '修改', '1', '[货物流动记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-21 14:42:27');
INSERT INTO `t_operalog` VALUES ('e0ed6b5513fc5f87a700ad203e7dc58e', '下拉项管理', '下拉列表', '修改', '1', '[半封闭] 下拉项值信息已修改', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-10-16 16:00:36');
INSERT INTO `t_operalog` VALUES ('e3370323c8cfe8291cbfd69e3d3d6b17', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-10 12:35:40');
INSERT INTO `t_operalog` VALUES ('e355d1a3b1b29c0425edc00f89d56f31', '下拉项管理', '下拉列表', '增加', '1', '[单程专线] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:00:04');
INSERT INTO `t_operalog` VALUES ('e3bc5a9b0072d51164abe9154a4779c1', '资源管理', '操作列表', '编辑', '1', '[企业认证] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 17:00:14');
INSERT INTO `t_operalog` VALUES ('e3e6728be7794842a8c41ca8eaa26717', '下拉项管理', '下拉列表', '增加', '1', '[配送] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-14 15:32:12');
INSERT INTO `t_operalog` VALUES ('e79b0aca28bd03144c80a573e33ea821', '资源管理', '菜单树', '修改', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-09 17:54:31');
INSERT INTO `t_operalog` VALUES ('e7e1209367a116d6710ddca20a9c5b2a', '资源管理', '操作列表', '编辑', '1', '[导出] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-13 00:31:18');
INSERT INTO `t_operalog` VALUES ('e8897f1de2573c6d1964ab0ee6cddb64', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-21 22:45:52');
INSERT INTO `t_operalog` VALUES ('e8f75a4a2b29cf49a996513b81d0d2b5', '下拉项管理', '下拉列表', '增加', '1', '[陆运] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-16 16:02:12');
INSERT INTO `t_operalog` VALUES ('e934849517fd7cdd9cb433bb0b8756b8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-20 11:07:56');
INSERT INTO `t_operalog` VALUES ('ea0641cc303e19a9f280b4a99ced69ae', '资源管理', '菜单树', '增加', '1', '[仓库信息管理] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-17 14:04:44');
INSERT INTO `t_operalog` VALUES ('ea3aa707206c46ba928e882df7743824', '资源管理', '菜单树', '修改', '1', '[承运商信息] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-14 13:35:17');
INSERT INTO `t_operalog` VALUES ('ea757e4c51364866a5a1f568518b484f', '资源管理', '菜单树', '修改', '1', '[承运商合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-10-12 23:55:57');
INSERT INTO `t_operalog` VALUES ('eafa4b405885432a503afe7146b0e7f1', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-22 09:39:36');
INSERT INTO `t_operalog` VALUES ('ec209d5152c39e15b62bcf9f9127ee89', '资源管理', '操作列表', '编辑', '1', '[添加] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-11 09:09:46');
INSERT INTO `t_operalog` VALUES ('ee2ebda766307efa5b8b7ded932a09e2', '资源管理', '菜单树', '增加', '1', '[会员合同记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-09 17:53:59');
INSERT INTO `t_operalog` VALUES ('f05987e381e112ed5443271d97e4dac8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-10 11:19:16');
INSERT INTO `t_operalog` VALUES ('f13fbbc5279cf1920352399541342d03', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-15 09:40:55');
INSERT INTO `t_operalog` VALUES ('f17b0c2eb1902d83a09fe1073bba7a3d', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-21 14:44:02');
INSERT INTO `t_operalog` VALUES ('f1a5a2a096bcc2e879d519ae270a9598', '资源管理', '菜单树', '增加', '1', '[承运商信誉等级] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-13 15:47:45');
INSERT INTO `t_operalog` VALUES ('f4934c7f158cd83f46db6919f9ffa594', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-12 23:58:54');
INSERT INTO `t_operalog` VALUES ('f518edfaad8a64260a1c656ca26f74fe', '资源管理', '菜单树', '增加', '1', '[货物流动记录] 菜单信息已保存', 'com.glacier.frame.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-10-21 14:40:54');
INSERT INTO `t_operalog` VALUES ('f6381856414402944312c03c196e33d9', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-15 15:55:04');
INSERT INTO `t_operalog` VALUES ('f78328df7d7a6ca00622d87ed84b6850', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-09 17:48:52');
INSERT INTO `t_operalog` VALUES ('f7a2b474cf507ef7df2bac43b36f50e8', '下拉项管理', '下拉项树', '增加', '1', '[取货方式] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-22 09:42:31');
INSERT INTO `t_operalog` VALUES ('f7ce4d1f92e3bbcd0a05f6696804e34f', '资源管理', '操作列表', '编辑', '1', '[启用/禁用] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-10-21 16:19:52');
INSERT INTO `t_operalog` VALUES ('f914600745ffc358d5559416ededd875', '下拉项管理', '下拉列表', '增加', '1', '[暂停运输] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-13 09:09:53');
INSERT INTO `t_operalog` VALUES ('f924a0d342f7bc19ae670a38b04f4523', '下拉项管理', '下拉项树', '增加', '1', '[维修状态] 下拉项信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-10-17 14:15:16');
INSERT INTO `t_operalog` VALUES ('f94fab38bec8e8be1ac8172116b7d375', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-15 15:55:17');
INSERT INTO `t_operalog` VALUES ('fa1590fa5bcc231646b5216ad83fa22b', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.frame.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-10-13 13:38:37');
INSERT INTO `t_operalog` VALUES ('fbca8f32aa695fcae011adb0f25c3ac7', '资源管理', '面板列表', '增加', '1', '[积分类型列表] 面板信息已保存', 'com.glacier.frame.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-10-10 11:18:48');
INSERT INTO `t_operalog` VALUES ('fd0c3b1521d3f8f30afd3a33cc74ce0b', '下拉项管理', '下拉列表', '增加', '1', '[空运] 下拉项值信息已保存', 'com.glacier.frame.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-10-16 16:03:11');
INSERT INTO `t_operalog` VALUES ('fee160ba1d9ae43e259f0f2d7facc8a0', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.frame.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-10-14 16:38:01');

-- ----------------------------
-- Table structure for `t_orders_dispatching`
-- ----------------------------
DROP TABLE IF EXISTS `t_orders_dispatching`;
CREATE TABLE `t_orders_dispatching` (
  `dispatching_id` varchar(32) NOT NULL,
  `dispatching_code` varchar(50) default NULL,
  `carrier_id` varchar(32) default NULL,
  `dispatching_goods_deposit` decimal(16,4) default NULL,
  `dispatching_status` enum('waitdistribution','distribution','completion') default NULL,
  `driver_id` varchar(32) default NULL,
  `dispatching_signfor` enum('notsigned','havesigned','partial') default NULL,
  `car_id` varchar(32) default NULL,
  `dispatch_time` datetime default NULL,
  `arrive_time` datetime default NULL,
  `status` enum('enable','disable') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`dispatching_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ʹ�����Ϣ����';

-- ----------------------------
-- Records of t_orders_dispatching
-- ----------------------------

-- ----------------------------
-- Table structure for `t_orders_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_orders_order`;
CREATE TABLE `t_orders_order` (
  `order_id` varchar(32) NOT NULL,
  `order_code` varchar(50) default NULL,
  `order_price` decimal(16,4) default NULL,
  `order_num` int(11) default NULL,
  `order_status` enum('waitconfirm','hasconfirmed','pickup','inspection','takedelivery','partial','close') default NULL,
  `status` enum('enable','disable') default NULL,
  `distribute_status` enum('waitdistribute','hasdistribute') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���������¼��Ϣ';

-- ----------------------------
-- Records of t_orders_order
-- ----------------------------

-- ----------------------------
-- Table structure for `t_orders_order_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_orders_order_info`;
CREATE TABLE `t_orders_order_info` (
  `order_info_id` varchar(32) NOT NULL,
  `belaidup_id` varchar(32) default NULL,
  `order_id` varchar(32) default NULL,
  `yes_or_no` enum('yes','no') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`order_info_id`),
  KEY `FK_order_info_belaidup_belaidup_id` (`belaidup_id`),
  KEY `FK_order_info_order_order_id` (`order_id`),
  CONSTRAINT `t_orders_order_info_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `t_orders_order` (`order_id`),
  CONSTRAINT `t_orders_order_info_ibfk_2` FOREIGN KEY (`belaidup_id`) REFERENCES `t_storehouse_belaidup` (`belaidup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���������Լ�����';

-- ----------------------------
-- Records of t_orders_order_info
-- ----------------------------

-- ----------------------------
-- Table structure for `t_orders_ordispatching_detailed`
-- ----------------------------
DROP TABLE IF EXISTS `t_orders_ordispatching_detailed`;
CREATE TABLE `t_orders_ordispatching_detailed` (
  `ordisdetailed_id` varchar(32) NOT NULL,
  `order_id` varchar(32) default NULL,
  `dispatching_id` varchar(32) default NULL,
  PRIMARY KEY  (`ordisdetailed_id`),
  KEY `FK_ordispatching_detailed_dispatching_dispatching_id` (`dispatching_id`),
  KEY `FK_ordispatching_detailed_order_order_id` (`order_id`),
  CONSTRAINT `t_orders_ordispatching_detailed_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `t_orders_order` (`order_id`),
  CONSTRAINT `t_orders_ordispatching_detailed_ibfk_2` FOREIGN KEY (`dispatching_id`) REFERENCES `t_orders_dispatching` (`dispatching_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�������ʹ����Լ�����';

-- ----------------------------
-- Records of t_orders_ordispatching_detailed
-- ----------------------------

-- ----------------------------
-- Table structure for `t_orders_tracking`
-- ----------------------------
DROP TABLE IF EXISTS `t_orders_tracking`;
CREATE TABLE `t_orders_tracking` (
  `tracking_id` varchar(32) NOT NULL,
  `dispatching_id` varchar(32) default NULL,
  `message` varchar(255) default NULL,
  `status` enum('enabled','disabled') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`tracking_id`),
  KEY `FK_tracking_dispatching_dispatching_id` (`dispatching_id`),
  CONSTRAINT `t_orders_tracking_ibfk_1` FOREIGN KEY (`dispatching_id`) REFERENCES `t_orders_dispatching` (`dispatching_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����ʹ�����Ϣ���и��ٹ���';

-- ----------------------------
-- Records of t_orders_tracking
-- ----------------------------

-- ----------------------------
-- Table structure for `t_panel`
-- ----------------------------
DROP TABLE IF EXISTS `t_panel`;
CREATE TABLE `t_panel` (
  `panel_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_cn_name` varchar(50) default NULL,
  `panel_en_name` varchar(50) default NULL,
  `order_num` int(11) default NULL,
  PRIMARY KEY  (`panel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_panel
-- ----------------------------
INSERT INTO `t_panel` VALUES ('0e90f7504fea42f41a94df7ce26da433', 'e1a79f5e3fe94e2e8fbe31fd6579ab9b', '班线管理列表', 'routeList', '1');
INSERT INTO `t_panel` VALUES ('20814591aaa67351ab28198ec8531c80', '5b6eaabb2c3a020c4d85ab50d11ffd85', '友情列表', 'LinkList', '1');
INSERT INTO `t_panel` VALUES ('28fe18d693742ae7db094fc750715c46', '54d652799e07bb8be54483301a89ff90', '帮助列表', 'HelpList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '1');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('39c5ecaa9e63b36e48f6eed0fc38f3fb', '7d7c98a8eb32ff5412d26b3e8ebf1b18', '承运商合同列表', 'CarrierContractList', '1');
INSERT INTO `t_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '2');
INSERT INTO `t_panel` VALUES ('4f9e05ef61075acbf30cd2d0d75647ca', '17752f099565a30aa90d48a4f13aa97a', '货物损坏记录列表', 'StorehouseDamageList', '1');
INSERT INTO `t_panel` VALUES ('557cf8b2740e6792f517138703afb407', 'ac892df07f9087fb1c89ac968bb5f555', '操作日志列表', 'OperalogList', '1');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('5cd4cb6d36559b7d7e3a022e53a3bd71', 'a652d3fe69c067cb94b73361351b8378', '新闻列表', 'NewsList', '1');
INSERT INTO `t_panel` VALUES ('60ef5b40e8753bdc2909a2413a379091', '14sdf54157cf483a790f4eea35dsf6f6', 'asdf', 'adf', '1');
INSERT INTO `t_panel` VALUES ('65abe86e2eff9d8db95b17b323dae0b0', '4a5f4f4c55665305938981a5f52d86ec', '货物流动记录列表', 'StorageGoodsrunList', '1');
INSERT INTO `t_panel` VALUES ('6b20ba67a120ba1fcaa5283c8c950f6d', 'a4144902eb68672fb147ef21d9470062', '承运商列表', 'carrierMemberList', '1');
INSERT INTO `t_panel` VALUES ('6bfbd59acf32fcab67d66381277f10b5', '9d9cc5684aa7dbf549d481d539fd3fe7', '车辆类型列表', 'CarrierCartypeList', '1');
INSERT INTO `t_panel` VALUES ('708e17657b99ed5a01fdaedba102defd', 'fe60a1800397a1c7d62ad980adf7cedb', '信誉度类型列表', 'CreditworthinessTypeList', '1');
INSERT INTO `t_panel` VALUES ('7179f4cc8e1af0a1787b2bf4880e4888', '9351ab194a4e54c2f1b3bc6ddf2bdfe4', '会员列表', 'MemberList', '1');
INSERT INTO `t_panel` VALUES ('77a687db775c4abe87de019b06f2f652', 'abf160d979050ef082b2b2b53e967618', '包装类型列表', 'PackageTypeList', '1');
INSERT INTO `t_panel` VALUES ('780a15a12d2fc981cccb418dafce08b2', '4f1b6666b70be892469b6e93c1eb30ce', '导航树', 'NavTree', '1');
INSERT INTO `t_panel` VALUES ('7ddf3df3ff79f22dfe87de23b674b086', '92548feb20b470297cf97b1af39c2512', '货主会员等级列表', 'MemberGradList', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('86d2ccad701f94c9e80d71557b1c62e6', '88ee044d59911b3b1a67ba4cdd0ee90d', '公告列表', 'AnnouncementList', '1');
INSERT INTO `t_panel` VALUES ('88108c897c8f22c468199b688da39ba9', '09bd4101bddc24db837be4479b6be382', '合同类型列表', 'ContractManagerList', '1');
INSERT INTO `t_panel` VALUES ('93fc21dd1e7d69dd439c77c9e94e25af', 'e75a41ba4a2bc299e3b50a15580a103b', '客服列表', 'ServiceList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('a1d130de95607ffc00fb455c749cf1a1', 'ab01dd2ac38d920f691bbc65b7a4bfb2', '招聘列表', 'HiringList', '1');
INSERT INTO `t_panel` VALUES ('a958fbe814da1040b304b0a55ad4b87d', '1da447eee943017b61e8da3c8acdc9ec', '承运商信誉等级列表', 'CarrierMemberGradList', '1');
INSERT INTO `t_panel` VALUES ('b52fa1566a9e33308bf59b83d5a8f04e', '97ff81ae86c2e88f442e98df0ed22046', '会员合同列表', 'ContractList', '1');
INSERT INTO `t_panel` VALUES ('b641fe58b8f9d34c77f557159beaca5f', '0d6ca38f1d454978003bc83312a92266', '承运商车辆信息列表', 'carrierCarInformationList', '1');
INSERT INTO `t_panel` VALUES ('b8a03efe50a44d460983badb4be96eea', 'b34761b59816e63743643c6f179683a4', '广告列表', 'AdvertisementList', '1');
INSERT INTO `t_panel` VALUES ('ce5a5cfd562e1520703f44c4f65720aa', '7c047a722ee223d015fe0b211134feed', '仓库类型列表', 'StorageTypeList', '1');
INSERT INTO `t_panel` VALUES ('e2c8d8b1ff17e4568e3b63e8f103831a', '659b38abc076de53bb0620ba047b8b77', '会员银行卡列表', 'BankCardList', '1');
INSERT INTO `t_panel` VALUES ('e3cc6780ba67ce00b8320e57cf77a80b', '0ad6ee84a7e9678dbb683d8911f1ce97', '积分类型列表', 'IntegralTypeList', '1');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('e9bcb940ecc7232664d94eab12c635f5', '67c5fe81349c08664ac7f5032fbc0934', '仓库信息列表', 'StorageList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('ed1135b4ad81bce24966571e4f3f9e15', '9c3c21783355119015ea6eff24d6773a', '货物类型列表', 'GoodsTypeList', '1');
INSERT INTO `t_panel` VALUES ('f7680d48de603e1b84c499d3bdfc16bd', 'e631330cc893bf752a63cb233a3510f4', '货物管理列表', 'BelaidupList', '1');
INSERT INTO `t_panel` VALUES ('f769a64bb571aa0c7ac269b807af4782', 'e42b98561176563f930d82c80b041ed8', '登录日志列表', 'LoginlogList', '1');
INSERT INTO `t_panel` VALUES ('f9794dbe00ebc11899a60e0d78831c14', '9a4d2a8cec977fc35d08a08d1f325a7d', '仓库维修列表', 'StorageRepairList', '1');
INSERT INTO `t_panel` VALUES ('fc1773fcced1a73ea1a36af0a233c684', 'd2cb9b9c44425ca4f4bf4dd2c3062371', '承运商银行卡列表', 'CarrierBankCardList', '1');
INSERT INTO `t_panel` VALUES ('swdf697aea23532eb8162f5ba1818c6f', 'de34654c5e6c1e94ee70cc833asd142', '地区树', 'AreaTree', '1');

-- ----------------------------
-- Table structure for `t_parameter_area`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_area`;
CREATE TABLE `t_parameter_area` (
  `area_id` varchar(32) NOT NULL,
  `area_pid` varchar(32) default NULL,
  `area_name` varchar(20) default NULL,
  `area_subsite` enum('subsite1','subsite0') default NULL,
  `accessory` varchar(255) default NULL,
  `area_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的地区设置。';

-- ----------------------------
-- Records of t_parameter_area
-- ----------------------------
INSERT INTO `t_parameter_area` VALUES ('2580884c5e6c1e94ee70cc833aa1c247', null, '广东', 'subsite1', '000', '1', '000', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('8740884c5e6c1e94ee70cc833aa1c123', '2580884c5e6c1e94ee70cc833aa1c247', '深圳', null, null, '1', '0755', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:28:48');
INSERT INTO `t_parameter_area` VALUES ('cd092470b03f7cad7a45dad4c9f6876b', '2580884c5e6c1e94ee70cc833aa1c247', '珠海', null, null, '2', '0756', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:21', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:28:54');
INSERT INTO `t_parameter_area` VALUES ('f6d7ea91dc3255d4d5efac64bb4923bd', 'cd092470b03f7cad7a45dad4c9f6876b', '香洲区', null, null, '1', '0756', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:28:58');
INSERT INTO `t_parameter_area` VALUES ('sdf2s2df1s2dg1ager521ger1ge2r1g', null, '广西', 'subsite1', '0358', '2', '0358', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('sdf3dsf3sd3g25s3dg2sdgsdg', 'sdf2s2df1s2dg1ager521ger1ge2r1g', '南宁', null, null, '1', '0358', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:29:12');
INSERT INTO `t_parameter_area` VALUES ('sdw0884c5e6c1e94ee70cc833aa1c2sd', '2580884c5e6c1e94ee70cc833aa1c247', '广州', null, null, '3', '020', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:29:05');

-- ----------------------------
-- Table structure for `t_parameter_carrier_car_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_carrier_car_type`;
CREATE TABLE `t_parameter_carrier_car_type` (
  `cartype_id` varchar(32) NOT NULL,
  `cartype_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`cartype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�Գ����̳�����������';

-- ----------------------------
-- Records of t_parameter_carrier_car_type
-- ----------------------------
INSERT INTO `t_parameter_carrier_car_type` VALUES ('d0a8f924798cefca7e94496fae2ce6a2', '大型货车', 'enable', '大型货车简介......', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 13:28:50', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 13:29:09');

-- ----------------------------
-- Table structure for `t_parameter_carrier_creditworthiness_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_carrier_creditworthiness_type`;
CREATE TABLE `t_parameter_carrier_creditworthiness_type` (
  `creditworthiness_type_id` varchar(32) NOT NULL,
  `creditworthiness_type` varchar(50) default NULL COMMENT '信誉度类型',
  `change_type` enum('increase','reduction') default NULL COMMENT '增加或者减少信誉度',
  `change_value` int(10) default NULL COMMENT '信誉值',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`creditworthiness_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_carrier_creditworthiness_type
-- ----------------------------
INSERT INTO `t_parameter_carrier_creditworthiness_type` VALUES ('658ecb5476cebbb91ccbdadf6323ee05', '运送信誉', 'increase', '2', '运送信誉', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 16:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 16:38:45');

-- ----------------------------
-- Table structure for `t_parameter_optgroup`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup`;
CREATE TABLE `t_parameter_optgroup` (
  `optgroup_id` varchar(32) NOT NULL,
  `optgroup_pid` varchar(32) default NULL,
  `optgroup_code` varchar(50) default NULL,
  `optgroup_name` varchar(50) default NULL,
  `optgroup_icon` varchar(50) default NULL,
  `optgroup_url` varchar(50) default NULL,
  `optgroup_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`optgroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的下拉项管理设置。';

-- ----------------------------
-- Records of t_parameter_optgroup
-- ----------------------------
INSERT INTO `t_parameter_optgroup` VALUES ('042388e1647c86d1487382f130d8dc92', '08ee4fae6977d717528acda4d7aa4d74', 'creditwortinssType', '信誉类型', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 15:30:07', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 15:30:07');
INSERT INTO `t_parameter_optgroup` VALUES ('08ee4fae6977d717528acda4d7aa4d74', null, 'carrier', '承运商管理', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:50:45', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:51:51');
INSERT INTO `t_parameter_optgroup` VALUES ('0af82d4dabd9cb2b809f01578965e028', '524a5f048b92584ff849a206f3c53076', 'help', '帮助中心', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:57:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('0b6919d96ff46e91471d9714bd1d205f', '113afb2ecac88fe851ad501c53b7d82b', 'auditState', '审核状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:15:43', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:04');
INSERT INTO `t_parameter_optgroup` VALUES ('0c3228a08340cf62f46938a21c98962f', '737573f6ede7bb7198de4e2cf0c77093', 'storageGoodsrun', '货物流动记录', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:53:52', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:53:52');
INSERT INTO `t_parameter_optgroup` VALUES ('0e52c1b8a089ab8870e371fcc7ff358e', '7403a6bef5b87b8bca7a191b836ccc2e', 'sortingStauts', '分拣状态', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:45:19', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:45:19');
INSERT INTO `t_parameter_optgroup` VALUES ('106d73ee75e429b00f03891931495c38', '737573f6ede7bb7198de4e2cf0c77093', 'storageRepair', '仓库维修管理', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:12:31', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:12:31');
INSERT INTO `t_parameter_optgroup` VALUES ('113afb2ecac88fe851ad501c53b7d82b', null, 'common', '公用下拉项', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:29:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:40:24');
INSERT INTO `t_parameter_optgroup` VALUES ('177804c92458def1f05611ea240bb52a', '08ee4fae6977d717528acda4d7aa4d74', 'boxType', '箱型', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 15:59:03', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 15:59:03');
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('28ee70d89cd44ab3e8f6a54929a47952', '0af82d4dabd9cb2b809f01578965e028', 'webHelpType', '帮助中心类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:59:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:31');
INSERT INTO `t_parameter_optgroup` VALUES ('34ae1dbd2ae8b36f6f700341add32e74', '08ee4fae6977d717528acda4d7aa4d74', 'transportType', '运送类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:53:04', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:55:02');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:47');
INSERT INTO `t_parameter_optgroup` VALUES ('43d3573874c2ea9e96a6a1194b468e52', '70f3280adc4b70b24d945e247909adbc', 'memberType', '会员类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-08 14:51:05', '8b25651c2d896297530b64e4b80ec503', '2014-10-08 14:51:05');
INSERT INTO `t_parameter_optgroup` VALUES ('496bba009c9f71bbd12c3a7c6b7823d5', '106d73ee75e429b00f03891931495c38', 'repairStauts', '维修状态', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:15:16', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:15:16');
INSERT INTO `t_parameter_optgroup` VALUES ('524a5f048b92584ff849a206f3c53076', null, 'website', '网站管理', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:56:19', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:13:50');
INSERT INTO `t_parameter_optgroup` VALUES ('554b2a40a638fee93361cdd7b2836448', '08ee4fae6977d717528acda4d7aa4d74', 'routeType', '班线类型', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:01:43', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:01:43');
INSERT INTO `t_parameter_optgroup` VALUES ('6580ffdb59f5f3fb194e42fa9f53da4c', '08ee4fae6977d717528acda4d7aa4d74', 'serviceType', '服务类型', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:58:50', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:58:50');
INSERT INTO `t_parameter_optgroup` VALUES ('6d914280163c8ea50001c23f26a4ce53', '113afb2ecac88fe851ad501c53b7d82b', 'yesOrNo', '是否', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:10:12', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:10:12');
INSERT INTO `t_parameter_optgroup` VALUES ('70f3280adc4b70b24d945e247909adbc', null, 'memberMgr', '会员管理', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:23:11', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:56');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:35');
INSERT INTO `t_parameter_optgroup` VALUES ('737573f6ede7bb7198de4e2cf0c77093', null, 'storehouse', '仓库管理', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:11:10', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:11:10');
INSERT INTO `t_parameter_optgroup` VALUES ('7403a6bef5b87b8bca7a191b836ccc2e', '737573f6ede7bb7198de4e2cf0c77093', 'belaidup', '货物管理', null, null, null, '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:41:49', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:41:49');
INSERT INTO `t_parameter_optgroup` VALUES ('753b8a2a972ae249ff10cb79ab435999', '08ee4fae6977d717528acda4d7aa4d74', 'transportStatus', '车辆运输状态', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:05:34', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 10:21:38');
INSERT INTO `t_parameter_optgroup` VALUES ('78fcc52b73d20414d5f2d3be95a6c71f', '85e58460ccff4edb5cbf43ceca970234', 'newType', '新闻类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:45:44', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:56:47');
INSERT INTO `t_parameter_optgroup` VALUES ('85e58460ccff4edb5cbf43ceca970234', '524a5f048b92584ff849a206f3c53076', 'new', '新闻管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:44:53', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:44:53');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('b437722ad80337b2548781b399d5b8e6', '70f3280adc4b70b24d945e247909adbc', 'integralType', '积分类型', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:29:03', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:29:03');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:28');
INSERT INTO `t_parameter_optgroup` VALUES ('c761b01d1aefc77ac84720092bd7168a', '70f3280adc4b70b24d945e247909adbc', 'changeType', '改变类型', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:30:52', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:30:52');
INSERT INTO `t_parameter_optgroup` VALUES ('d889a5b93b20aef8cb25baa06e5ad4da', '106d73ee75e429b00f03891931495c38', 'grade', '严重程度', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:13:39', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:13:39');
INSERT INTO `t_parameter_optgroup` VALUES ('f5350a87a7d71cf226bfdae837195dde', '7403a6bef5b87b8bca7a191b836ccc2e', 'replenishment', '取货方式', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:42:31', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:42:31');
INSERT INTO `t_parameter_optgroup` VALUES ('fdf78bcc980b29a21a65131eab1c1b38', '113afb2ecac88fe851ad501c53b7d82b', 'builtin', '内置', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:12');
INSERT INTO `t_parameter_optgroup` VALUES ('febfef3ab7269099372b40118ef07b92', '0c3228a08340cf62f46938a21c98962f', 'goodsrunStatus', '货物状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:54:39', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:54:39');
INSERT INTO `t_parameter_optgroup` VALUES ('ss34g1rgrh1dfhsjdfh124564sdf21d', '2rtfdg1rgrh1dfhsjdfh124564sdf21d', 'user', '用户设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:25');

-- ----------------------------
-- Table structure for `t_parameter_optgroup_value`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup_value`;
CREATE TABLE `t_parameter_optgroup_value` (
  `optgroup_value_id` varchar(32) NOT NULL,
  `optgroup_id` varchar(32) default NULL,
  `optgroup_value_code` varchar(50) default NULL,
  `optgroup_value_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `optgroup_value_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`optgroup_value_id`),
  KEY `FK_t_optvalue_t_parameter_optgroup_optgroup_id` (`optgroup_id`),
  CONSTRAINT `FK_t_optvalue_t_parameter_optgroup_optgroup_id` FOREIGN KEY (`optgroup_id`) REFERENCES `t_parameter_optgroup` (`optgroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的下拉项值设置。';

-- ----------------------------
-- Records of t_parameter_optgroup_value
-- ----------------------------
INSERT INTO `t_parameter_optgroup_value` VALUES ('02b9ec2820c5b3e1008c0afcd7b94740', '042388e1647c86d1487382f130d8dc92', 'dispatching', '配送', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 15:32:12', '8b25651c2d896297530b64e4b80ec503', '2014-10-14 15:32:12');
INSERT INTO `t_parameter_optgroup_value` VALUES ('02df4e5c07bb38221b41c9c74448fd8f', '87e805fcf0c779b8f57fde22d819e2db', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0726b3f483bf412d65c96257118a8965', '6580ffdb59f5f3fb194e42fa9f53da4c', 'backTracking', '返程车', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:59:36', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:00:14');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0ae9bb97830725736e9e73a8ccc700b9', 'febfef3ab7269099372b40118ef07b92', 'completed', '退货完成', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:57:03', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:57:03');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0d1c269b3dd566af5561fdf03ba6fd1d', '6d914280163c8ea50001c23f26a4ce53', 'no', '否', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:10:39', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:10:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a41da9325b5db271741f2245055095b', '28ee70d89cd44ab3e8f6a54929a47952', 'borrow', '借款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:01:18', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1bc3f1c6c5459483ae1950dacb5b97f1', 'd889a5b93b20aef8cb25baa06e5ad4da', 'commonly', '一般', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:14:47', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:14:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1e5e931b4143d75568749e9898d29abb', '78fcc52b73d20414d5f2d3be95a6c71f', 'land', '陆运新闻', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:47:53', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:47:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1f784851dd779ce80f2ecb1455502681', '78fcc52b73d20414d5f2d3be95a6c71f', 'airlift', '空运新闻', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:47:12', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:47:12');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('30a802fe68e49a04c53f072ce42e00d8', '6580ffdb59f5f3fb194e42fa9f53da4c', 'onePath', '单程专线', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:00:04', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:00:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3ebc7459c9a71bbd1a62e0a377ea5cfc', 'febfef3ab7269099372b40118ef07b92', 'business', '交易完成', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:57:37', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:57:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('40de3119493f8c6abe293fdfd6c3eb17', '496bba009c9f71bbd12c3a7c6b7823d5', 'norepair', '未维修', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:15:45', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:15:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5122f4929b14499ebd97f7f99552d5c7', '28ee70d89cd44ab3e8f6a54929a47952', 'fund', '基金', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:27', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('62d92a9a40004540214c2034a2b7e8d2', '753b8a2a972ae249ff10cb79ab435999', 'wait', '待调动', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:08', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('68a204dd3ba7a6e7d9c354847eff6057', '753b8a2a972ae249ff10cb79ab435999', 'inTransit', '运输中', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:24', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6c2cba863291a874a501fb2bab94cbd3', '43d3573874c2ea9e96a6a1194b468e52', 'enterprise', '企业会员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-08 15:17:01', '8b25651c2d896297530b64e4b80ec503', '2014-10-08 15:17:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6e85ef9888dbb2f2dad16c350522b1bb', '554b2a40a638fee93361cdd7b2836448', 'seaTransportation', '海运', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:02:42', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:02:42');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6ecce60d228aaf8469585a70991c8791', 'd889a5b93b20aef8cb25baa06e5ad4da', 'grave', '严重', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:14:01', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:14:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6fb17c598b61733f9ec32e53d7d5e418', 'c761b01d1aefc77ac84720092bd7168a', 'reduction', '减少', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 13:37:10', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 13:37:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('72b41dde8f743dabac2c5927cbe8118a', '753b8a2a972ae249ff10cb79ab435999', 'cease', '暂停运输', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:53', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('74f207ab1298c027676883f6b29bbf96', '6d914280163c8ea50001c23f26a4ce53', 'yes', '是', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:10:27', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:10:27');
INSERT INTO `t_parameter_optgroup_value` VALUES ('7b3fe71548c0025697d998613d7a4834', '34ae1dbd2ae8b36f6f700341add32e74', 'partial', '零装', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:53:56', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:53:56');
INSERT INTO `t_parameter_optgroup_value` VALUES ('7bcb598775e4260c5a0700e4c462a8cf', 'f5350a87a7d71cf226bfdae837195dde', 'storepickup', '上门取货', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:42:45', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:42:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('7e184639e1571a4cd57d7e73ffb64824', 'febfef3ab7269099372b40118ef07b92', 'wayback', '回途中', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:57:58', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:57:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('805c928f52be220d1f061b09b5f17d14', 'febfef3ab7269099372b40118ef07b92', 'return', '申请退货', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:56:37', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:56:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('82c492253fd94a4ff8e335c64f0d5c01', '0e52c1b8a089ab8870e371fcc7ff358e', 'hassorting', '已分拣', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:45:48', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:45:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9bb76845e70659df417021a079970cac', '496bba009c9f71bbd12c3a7c6b7823d5', 'alreadyrepair', '已维修', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:16:02', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:16:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9e91d4457f7c176b3fcf1c55efea8473', '177804c92458def1f05611ea240bb52a', 'flat', '平板', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:00:57', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:00:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a415c55dc24d1ae7491a5cf11d75b4b5', '43d3573874c2ea9e96a6a1194b468e52', 'individuality', '个体会员', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-08 15:17:32', '8b25651c2d896297530b64e4b80ec503', '2014-10-08 15:17:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('abbd756ef1bbf063b9d5a038cc634a41', 'febfef3ab7269099372b40118ef07b92', 'receiving', '收货入库', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:55:37', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:55:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b4682573f0c46d84272b5def77704bb2', '753b8a2a972ae249ff10cb79ab435999', 'servicing', '维修中', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:38', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:09:38');
INSERT INTO `t_parameter_optgroup_value` VALUES ('bab270581d2e00dd52cbfbcb1f597551', 'c761b01d1aefc77ac84720092bd7168a', 'increase', '增加', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:31:15', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:31:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cad25e086ef9d002311caf5b5b591b1e', '34ae1dbd2ae8b36f6f700341add32e74', 'all', '整车', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:53:38', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 08:53:38');
INSERT INTO `t_parameter_optgroup_value` VALUES ('caf0c23df018447822b1ace3a53c4a60', '78fcc52b73d20414d5f2d3be95a6c71f', 'trade', '贸易新闻', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:48:32', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:48:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cd2eb2eec7147152663d48eca89fa734', '0e52c1b8a089ab8870e371fcc7ff358e', 'waitsorting', '等待分拣', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:45:34', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:45:34');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cef639d80ab89a98df7301fc8b084d32', '28ee70d89cd44ab3e8f6a54929a47952', 'invest', '投资', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('d4297fa8b2760b1550ddcf2e98775e8e', '177804c92458def1f05611ea240bb52a', 'fullClosed', '封闭', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:00:08', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:00:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('db467fbc17546848ce2e2790301524db', 'b437722ad80337b2548781b399d5b8e6', 'login', '登录', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:29:46', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:29:46');
INSERT INTO `t_parameter_optgroup_value` VALUES ('df7c8a2f3e02fc867d0a985149dc5bf9', 'd889a5b93b20aef8cb25baa06e5ad4da', 'middling', '中等', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:14:29', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:14:29');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e482683ab80d3070308c8c170fcc6443', '554b2a40a638fee93361cdd7b2836448', 'landCarriage', '陆运', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:02:12', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:02:12');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e848029fdf8c18c2e10dd8ce40333279', '78fcc52b73d20414d5f2d3be95a6c71f', 'sea', '海运新闻', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:49:00', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 15:49:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ef6c298bdf71c17f148e7c8f303a3876', 'febfef3ab7269099372b40118ef07b92', 'delivery', '出库运输', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:56:17', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:56:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f081962b0b8f3b28b727c60b821dbee2', '87e805fcf0c779b8f57fde22d819e2db', 'woman', '女', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f1498ee9de5b4e78fe4654ae3b3175bb', '0b6919d96ff46e91471d9714bd1d205f', 'pass', '审核通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('fdf53c8e636ad3631faa58684215f669', '177804c92458def1f05611ea240bb52a', 'semiClosed', '半封闭', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:00:29', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:00:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ff33ab7595ad7a5e79824165c385d688', '554b2a40a638fee93361cdd7b2836448', 'air', '空运', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:03:11', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 16:03:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ffc8ddfb7164eb9836f2189ca6b543ba', 'f5350a87a7d71cf226bfdae837195dde', 'deliversm', '送货上门', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:42:59', '8b25651c2d896297530b64e4b80ec503', '2014-10-22 09:42:59');

-- ----------------------------
-- Table structure for `t_parameter_system_variables`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_system_variables`;
CREATE TABLE `t_parameter_system_variables` (
  `variables_id` varchar(32) NOT NULL COMMENT '系统变量Id',
  `specification` varchar(50) default NULL COMMENT '参数说明',
  `input_tip` varchar(50) default NULL COMMENT '输入提示',
  `parameter_values` varchar(50) default NULL COMMENT '参数值',
  `variable_name` varchar(50) default NULL COMMENT '变量名',
  `form_type` enum('input','textarea') default NULL COMMENT '表单类型',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`variables_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的系统变量';

-- ----------------------------
-- Records of t_parameter_system_variables
-- ----------------------------
INSERT INTO `t_parameter_system_variables` VALUES ('4css921507de7b121d37b460d65b5g', '参数说明', '输入提示', '1.00', '变量名', 'input', '测试数据', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 15:22:26', '8b25651c2d896297530b64e4b80ec503', '2014-08-18 17:36:01');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` varchar(32) NOT NULL,
  `role_en_name` varchar(25) NOT NULL,
  `role_cn_name` varchar(25) default NULL,
  `builtin` varchar(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'TEST', '测试角色', 'custom', '测试角色', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 00:00:00');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'admin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 02:58:58');

-- ----------------------------
-- Table structure for `t_shipper_enterprise_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_enterprise_member`;
CREATE TABLE `t_shipper_enterprise_member` (
  `member_id` varchar(32) NOT NULL,
  `enterprise_name` varchar(50) default NULL,
  `deputy` varchar(32) default NULL,
  `area` varchar(50) default NULL,
  `detailed_address` varchar(255) default NULL,
  `property` varchar(32) default NULL,
  `enterprise_type` varchar(32) default NULL,
  `trade` varchar(32) default NULL,
  `enterprise_phone` varchar(32) default NULL,
  `enterprise_img` varchar(32) default NULL,
  `enterprise_logo` varchar(32) default NULL,
  `enterprise_fax` varchar(32) default NULL,
  `enterprise_summary` varchar(255) default NULL,
  `auth_state` enum('authstr','pass','failure') default NULL,
  `auth` varchar(32) default NULL,
  `auth_time` datetime default NULL,
  `auth_remark` varchar(255) default NULL,
  PRIMARY KEY  (`member_id`),
  CONSTRAINT `FK_shipper_member_enterprise_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_shipper_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_enterprise_member
-- ----------------------------
INSERT INTO `t_shipper_enterprise_member` VALUES ('1', 'TCL', '王五', '深圳', '深圳宝安区', ' 家具公司', '生产企业', null, null, null, null, null, null, 'authstr', null, null, '');

-- ----------------------------
-- Table structure for `t_shipper_individuality_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_individuality_member`;
CREATE TABLE `t_shipper_individuality_member` (
  `member_id` varchar(32) NOT NULL,
  `sex` enum('man','woman') default NULL,
  `member_age` int(5) default NULL,
  `home_phone` varchar(32) default NULL,
  `card_id` varchar(32) default NULL,
  `member_real_name` varchar(32) default NULL,
  `member_qq` int(20) default NULL,
  `mobile_number` varchar(32) default NULL,
  `detailed_address` varchar(100) default NULL,
  PRIMARY KEY  (`member_id`),
  CONSTRAINT `FK_shipper_member_enterprise_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_shipper_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_individuality_member
-- ----------------------------
INSERT INTO `t_shipper_individuality_member` VALUES ('2', 'man', '23', null, '12313442131', '王五', '454646546', '13411231231', '深圳宝安区~~~');
INSERT INTO `t_shipper_individuality_member` VALUES ('3', 'man', '33', null, '111111111111', '张三', '3323232', '123124132', '杭州');

-- ----------------------------
-- Table structure for `t_shipper_integral_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_integral_type`;
CREATE TABLE `t_shipper_integral_type` (
  `integral_type_id` varchar(32) NOT NULL,
  `integral_type` varchar(50) default NULL COMMENT '积分类型',
  `change_type` enum('increase','reduction') default NULL COMMENT ' 增加还是减少',
  `change_value` int(10) default NULL COMMENT '积分变量值',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`integral_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_integral_type
-- ----------------------------
INSERT INTO `t_shipper_integral_type` VALUES ('1', 'login', 'increase', '2', '登录活动2积分', '8b25651c2d896297530b64e4b80ec503', '2014-10-09 15:39:31', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:32:52');

-- ----------------------------
-- Table structure for `t_shipper_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_member`;
CREATE TABLE `t_shipper_member` (
  `member_id` varchar(32) NOT NULL,
  `member_name` varchar(32) default NULL,
  `member_password` varchar(64) default NULL,
  `traders_password` varchar(64) default NULL,
  `account_balance` decimal(16,4) default NULL,
  `live_address` varchar(32) default NULL,
  `member_photo` varchar(255) default NULL,
  `registration_time` datetime default NULL,
  `last_login_time` datetime default NULL,
  `member_type` enum('individuality','enterprise') default NULL,
  `email` varchar(32) default NULL,
  `integral` int(5) default NULL,
  `status` enum('enable','disable') default NULL,
  `login_count` int(5) default NULL,
  `last_login_ip_address` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_member
-- ----------------------------
INSERT INTO `t_shipper_member` VALUES ('1', 'TCL电器', '123', '123', '100.0000', '珠海', null, '2014-10-08 14:44:09', '2014-10-08 14:44:13', 'enterprise', '555545@QQ.com', '0', 'enable', '1', '126.11.52.3', null, null, '2014-10-08 14:44:39', null, null);
INSERT INTO `t_shipper_member` VALUES ('2', '王五', '123', '123', '0.0000', '深圳', null, '2014-10-09 11:30:34', '2014-10-09 11:30:37', 'individuality', '555545@QQ.com', '0', 'enable', '1', '192.168.1.1', '~~~', null, '2014-10-09 11:30:53', null, null);
INSERT INTO `t_shipper_member` VALUES ('3', '张三', '123', '123', '500.0000', '杭州', null, '2014-10-09 16:25:06', '2014-10-09 16:25:10', 'individuality', null, '10', 'disable', '1', null, null, null, '2014-10-09 16:25:36', null, null);
INSERT INTO `t_shipper_member` VALUES ('65b65c73432158cb4eb52c20099dd2e9', '123456', 'fea3ddd53a7352b51767dec7003fe535b85d88ff', 'fea3ddd53a7352b51767dec7003fe535b85d88ff', null, null, 'http://bdmu.v068041.10000net.cn/netloan-website/resources/images/shipperMember/shipperMember.jpg', '2014-10-11 08:46:38', '2014-10-11 08:46:38', 'individuality', '406592176@qq.com', null, 'enable', '1', '127.0.0.1[本地]', null, '超级管理员', '2014-10-11 08:46:38', '超级管理员', '2014-10-11 08:46:38');

-- ----------------------------
-- Table structure for `t_shipper_member_bank_card`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_member_bank_card`;
CREATE TABLE `t_shipper_member_bank_card` (
  `bankcard_id` varchar(32) NOT NULL,
  `member_id` varchar(32) default NULL,
  `bank_name` varchar(32) default NULL,
  `card_name` varchar(32) default NULL,
  `card_number` varchar(32) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `audit` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`bankcard_id`),
  KEY `FK_shipper_member_bank_card_member_id` (`member_id`),
  CONSTRAINT `FK_shipper_member_bank_card_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_shipper_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_member_bank_card
-- ----------------------------
INSERT INTO `t_shipper_member_bank_card` VALUES ('1', '1', '中国工商银行', '借记卡', '12345678903456', 'failure', '8b25651c2d896297530b64e4b80ec503', '该借记卡通过', '2014-10-10 03:52:20', '完美', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 03:52:04', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 22:11:14');

-- ----------------------------
-- Table structure for `t_shipper_member_contract_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_member_contract_record`;
CREATE TABLE `t_shipper_member_contract_record` (
  `contract_record_id` varchar(32) NOT NULL,
  `goods_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `contract_type_id` varchar(32) default NULL,
  `platform_id` varchar(32) default NULL,
  `status` enum('enable','disable') default NULL,
  `contract_content` varchar(255) default NULL,
  `operation_time` datetime default NULL,
  `close_time` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`contract_record_id`),
  KEY `FK_contract_type_member_contract_record_contract_type_id` (`contract_type_id`),
  KEY `FK_shipper_member_contract_record_member_id` (`member_id`),
  CONSTRAINT `FK_contract_type_member_contract_record_contract_type_id` FOREIGN KEY (`contract_type_id`) REFERENCES `t_member_contract_type` (`contract_type_id`),
  CONSTRAINT `FK_shipper_member_contract_record_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_shipper_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_member_contract_record
-- ----------------------------
INSERT INTO `t_shipper_member_contract_record` VALUES ('1', '旺旺雪饼', '1', '1', '越海平台', 'enable', '我们遵纪守法', '2014-10-10 00:47:15', '2014-10-11 00:47:18', '合同', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 00:48:13', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 00:48:19');

-- ----------------------------
-- Table structure for `t_shipper_member_grade`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_member_grade`;
CREATE TABLE `t_shipper_member_grade` (
  `grade_id` varchar(32) NOT NULL,
  `grade_name` varchar(32) default NULL,
  `scope_start` int(5) default NULL,
  `scope_stop` int(5) default NULL,
  `grade_img` varchar(255) default NULL,
  `grade_GPS` enum('enable','disable') default NULL,
  `grade_email` enum('enable','disable') default NULL,
  `grade_mobile` enum('enable','disable') default NULL,
  `grade_first` enum('enable','disable') default NULL,
  `grade_discount` decimal(16,4) default NULL,
  `grade_cashpayment` enum('enable','disable') default NULL,
  `grade_destination` enum('enable','disable') default NULL,
  `grade_monthly` enum('enable','disable') default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`grade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_member_grade
-- ----------------------------
INSERT INTO `t_shipper_member_grade` VALUES ('228226e406701396dcc03d4b1a44d0f8', '一级会员', '10', '101', '', 'enable', 'enable', 'enable', 'disable', '0.0000', 'enable', 'disable', 'disable', 'enable', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:50:15', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:50:28');

-- ----------------------------
-- Table structure for `t_shipper_member_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_member_integral`;
CREATE TABLE `t_shipper_member_integral` (
  `shipper_member_integral_id` varchar(32) NOT NULL,
  `member_id` varchar(32) default NULL,
  `integral_type_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`shipper_member_integral_id`),
  KEY `FK_shipper_member_integral_integral_type_id` (`integral_type_id`),
  KEY `FK_shipper_member_integral_member_member_id` (`member_id`),
  CONSTRAINT `t_shipper_member_integral_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_shipper_member` (`member_id`),
  CONSTRAINT `t_shipper_member_integral_ibfk_2` FOREIGN KEY (`integral_type_id`) REFERENCES `t_shipper_integral_type` (`integral_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_member_integral
-- ----------------------------
INSERT INTO `t_shipper_member_integral` VALUES ('1', '1', '1', '1', '', '2014-10-14 15:19:38', null, null);

-- ----------------------------
-- Table structure for `t_shipper_member_token`
-- ----------------------------
DROP TABLE IF EXISTS `t_shipper_member_token`;
CREATE TABLE `t_shipper_member_token` (
  `member_id` varchar(32) NOT NULL,
  `member_name` varchar(32) default NULL,
  `password` varchar(64) default NULL,
  `salt` varchar(64) default NULL,
  `traders_password` varchar(64) default NULL,
  `traders_salt` varchar(64) default NULL,
  PRIMARY KEY  (`member_id`),
  CONSTRAINT `FK_shipper_member_grade_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_shipper_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shipper_member_token
-- ----------------------------
INSERT INTO `t_shipper_member_token` VALUES ('1', 'TCL电器', '123', '1', '123', '1');
INSERT INTO `t_shipper_member_token` VALUES ('2', '王五', '123', '2', '123', '2');
INSERT INTO `t_shipper_member_token` VALUES ('3', '张三', '123', '3', '123', '3');
INSERT INTO `t_shipper_member_token` VALUES ('65b65c73432158cb4eb52c20099dd2e9', '123456', 'fea3ddd53a7352b51767dec7003fe535b85d88ff', '7e91b89f77b0371a', 'fea3ddd53a7352b51767dec7003fe535b85d88ff', '7e91b89f77b0371a');

-- ----------------------------
-- Table structure for `t_storehouse_belaidup`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_belaidup`;
CREATE TABLE `t_storehouse_belaidup` (
  `belaidup_id` varchar(32) NOT NULL,
  `belaidup_prod_name` varchar(50) default NULL,
  `member_id` varchar(32) default NULL,
  `belaidup_unitprice` decimal(16,4) default NULL,
  `goodstype_id` varchar(32) default NULL,
  `yes_or_no` enum('yes','no') default NULL,
  `belaidup_weight` float default NULL,
  `belaidup_bulk` float default NULL,
  `repertory_price` decimal(16,4) default NULL,
  `stock_price` decimal(16,4) default NULL,
  `pack_price` decimal(16,4) default NULL,
  `freight_price` decimal(16,4) default NULL,
  `belaidup_initiatin` varchar(50) default NULL,
  `belaidup_terminu` varchar(50) default NULL,
  `replenishment` enum('storepickup','deliversm') default NULL,
  `order_consignee` varchar(50) default NULL,
  `order_phone` varchar(11) default NULL,
  `order_address` varchar(255) default NULL,
  `belaidup_status` enum('receiving','delivery','return','completed','wayback','business') default NULL,
  `sorting_stauts` enum('waitsorting','hassorting') default NULL,
  `stauts` enum('enable','disable') default NULL,
  `belaidup_return_time` datetime default NULL,
  `belaidup_return_poundage` decimal(16,4) default NULL,
  `belaidup_bar_code` varchar(18) default NULL,
  `storehouse_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`belaidup_id`),
  KEY `FK_belaidup_goodstype_set_goodstype_id` (`goodstype_id`),
  CONSTRAINT `t_storehouse_belaidup_ibfk_1` FOREIGN KEY (`goodstype_id`) REFERENCES `t_storehouse_goodstype_set` (`goodstype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='������Ϣ����';

-- ----------------------------
-- Records of t_storehouse_belaidup
-- ----------------------------
INSERT INTO `t_storehouse_belaidup` VALUES ('1', '麻辣豆腐', '1', '12.0000', '5029333bfac9095fa29e9de43d131a88', 'yes', '1', '3', '12.0000', '12.0000', '12.0000', '12.0000', '12', '12', 'storepickup', '12', '13631259611', '哈工大', 'receiving', 'waitsorting', 'enable', '2014-10-21 16:36:06', '1.0000', '1', '1', '棒棒哒', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 16:36:55', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 16:37:00');

-- ----------------------------
-- Table structure for `t_storehouse_damage`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_damage`;
CREATE TABLE `t_storehouse_damage` (
  `damage_id` varchar(32) NOT NULL,
  `belaidup_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `yes_or_no` enum('yes','no') default NULL,
  `audit_status` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_date` datetime default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`damage_id`),
  KEY `FK_damage_belaidup_belaidup_id` (`belaidup_id`),
  CONSTRAINT `t_storehouse_damage_ibfk_1` FOREIGN KEY (`belaidup_id`) REFERENCES `t_storehouse_belaidup` (`belaidup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���Ѿ�����Ļ�������Ƿ��𻵼�¼';

-- ----------------------------
-- Records of t_storehouse_damage
-- ----------------------------
INSERT INTO `t_storehouse_damage` VALUES ('1', '1', '损坏', 'yes', 'pass', '8b25651c2d896297530b64e4b80ec503', '轻度损坏', '2014-10-21 21:22:53', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 21:22:57', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 23:29:51');

-- ----------------------------
-- Table structure for `t_storehouse_goodstype_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_goodstype_set`;
CREATE TABLE `t_storehouse_goodstype_set` (
  `goodstype_id` varchar(32) NOT NULL,
  `goodstype_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`goodstype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�Ի��������������';

-- ----------------------------
-- Records of t_storehouse_goodstype_set
-- ----------------------------
INSERT INTO `t_storehouse_goodstype_set` VALUES ('5029333bfac9095fa29e9de43d131a88', ' 水果型', 'enable', '水果类型！。。', '8b25651c2d896297530b64e4b80ec503', '2014-10-20 10:20:41', '8b25651c2d896297530b64e4b80ec503', '2014-10-20 10:21:40');

-- ----------------------------
-- Table structure for `t_storehouse_packagetype_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_packagetype_set`;
CREATE TABLE `t_storehouse_packagetype_set` (
  `packagetype_id` varchar(32) NOT NULL,
  `packagetype_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`packagetype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�Ի�����а�װ��������';

-- ----------------------------
-- Records of t_storehouse_packagetype_set
-- ----------------------------
INSERT INTO `t_storehouse_packagetype_set` VALUES ('793def3c6dbfad3e96718aefdb49d765', '油纸箱', 'enable', '能防止水份渗透！。。', '8b25651c2d896297530b64e4b80ec503', '2014-10-20 11:12:25', '8b25651c2d896297530b64e4b80ec503', '2014-10-20 11:14:46');

-- ----------------------------
-- Table structure for `t_storehouse_pack_code`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_pack_code`;
CREATE TABLE `t_storehouse_pack_code` (
  `pack_code_id` varchar(32) NOT NULL,
  `packagetype_id` varchar(32) default NULL,
  `belaidup_id` varchar(32) default NULL,
  `pack_bar_code` varchar(18) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`pack_code_id`),
  KEY `FK_pack_code_belaidup_belaidup_id` (`belaidup_id`),
  KEY `FK_pack_code_packagetype_set_packagetype_id` (`packagetype_id`),
  CONSTRAINT `t_storehouse_pack_code_ibfk_1` FOREIGN KEY (`packagetype_id`) REFERENCES `t_storehouse_packagetype_set` (`packagetype_id`),
  CONSTRAINT `t_storehouse_pack_code_ibfk_2` FOREIGN KEY (`belaidup_id`) REFERENCES `t_storehouse_belaidup` (`belaidup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�԰�װ�Ļ���İ�װ�����������';

-- ----------------------------
-- Records of t_storehouse_pack_code
-- ----------------------------

-- ----------------------------
-- Table structure for `t_storehouse_return_applications`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_return_applications`;
CREATE TABLE `t_storehouse_return_applications` (
  `return_id` varchar(32) NOT NULL,
  `return_title` varchar(50) default NULL,
  `belaidup_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `audit_status` enum('authstr','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_opinion` varchar(255) default NULL,
  `audit_date` datetime default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`return_id`),
  KEY `FK_return_applications_belaidup_belaidup_id` (`belaidup_id`),
  CONSTRAINT `t_storehouse_return_applications_ibfk_1` FOREIGN KEY (`belaidup_id`) REFERENCES `t_storehouse_belaidup` (`belaidup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�˻������¼';

-- ----------------------------
-- Records of t_storehouse_return_applications
-- ----------------------------

-- ----------------------------
-- Table structure for `t_storehouse_storage`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_storage`;
CREATE TABLE `t_storehouse_storage` (
  `storage_id` varchar(32) NOT NULL,
  `storage_code` varchar(50) default NULL,
  `storagetype_id` varchar(32) default NULL,
  `storage_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `user_id` varchar(32) default NULL,
  `yes_or_no` enum('yes','no') default NULL,
  `build_date` datetime default NULL,
  `must_overhaul_num` int(11) default NULL,
  `already_overhaul_num` int(11) default NULL,
  `next_overhaul_date` datetime default NULL,
  `weight_upper_bound` float default NULL,
  `usable_weight` float default NULL,
  `bulk_upper_bound` float default NULL,
  `usable_bulk` float default NULL,
  `storage_tel` varchar(11) default NULL,
  `storage_address` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`storage_id`),
  KEY `FK_storage_storagetype_set_storagetype_id` (`storagetype_id`),
  CONSTRAINT `t_storehouse_storage_ibfk_1` FOREIGN KEY (`storagetype_id`) REFERENCES `t_storehouse_storagetype_set` (`storagetype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ֿ����';

-- ----------------------------
-- Records of t_storehouse_storage
-- ----------------------------
INSERT INTO `t_storehouse_storage` VALUES ('48216dbd85198dbeb95f253ad0215c3c', 'ST_STORAGE_2014_10_16_1', '0d8c4ef43c6ce99d0fd3edb140eae202', 'A站冷冻库', 'enable', 'd6dc13121742a3b331dcb6f93d4f4bce', 'no', '2014-10-10 00:00:00', '6', '0', null, '300', '300', '300', '300', '1234567', '广东南方职业培训学院', '很冷的仓库。', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 15:30:28', '8b25651c2d896297530b64e4b80ec503', '2014-10-16 15:57:14');

-- ----------------------------
-- Table structure for `t_storehouse_storagetype_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_storagetype_set`;
CREATE TABLE `t_storehouse_storagetype_set` (
  `storagetype_id` varchar(32) NOT NULL,
  `storagetype_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`storagetype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�Բֿ����һ�����͵�����';

-- ----------------------------
-- Records of t_storehouse_storagetype_set
-- ----------------------------
INSERT INTO `t_storehouse_storagetype_set` VALUES ('0d8c4ef43c6ce99d0fd3edb140eae202', '冷冻型', 'enable', '冷冷的冰雨落在我的脸庞！', '8b25651c2d896297530b64e4b80ec503', '2014-10-15 15:56:42', '8b25651c2d896297530b64e4b80ec503', '2014-10-15 16:05:02');

-- ----------------------------
-- Table structure for `t_storehouse_storage_goodsrun`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_storage_goodsrun`;
CREATE TABLE `t_storehouse_storage_goodsrun` (
  `goodsrun_id` varchar(32) NOT NULL,
  `belaidup_id` varchar(32) default NULL,
  `goodsrun_num` int(11) default NULL,
  `goodsrun_status` enum('receiving','delivery','return','completed','business','wayback') default NULL,
  `status` enum('enable','disable') default NULL,
  `goodsrun_date` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`goodsrun_id`),
  KEY `FK_goodsrun_belaidup_belaidup_id` (`belaidup_id`),
  CONSTRAINT `t_storehouse_storage_goodsrun_ibfk_1` FOREIGN KEY (`belaidup_id`) REFERENCES `t_storehouse_belaidup` (`belaidup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�Ի���Ķ�����м�¼';

-- ----------------------------
-- Records of t_storehouse_storage_goodsrun
-- ----------------------------
INSERT INTO `t_storehouse_storage_goodsrun` VALUES ('1', '1', '100', 'delivery', 'disable', '2014-10-21 14:47:34', '速度发货', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:48:22', '8b25651c2d896297530b64e4b80ec503', '2014-10-21 14:48:26');

-- ----------------------------
-- Table structure for `t_storehouse_storage_repair`
-- ----------------------------
DROP TABLE IF EXISTS `t_storehouse_storage_repair`;
CREATE TABLE `t_storehouse_storage_repair` (
  `repair_id` varchar(32) NOT NULL,
  `repair_title` varchar(50) default NULL,
  `remark` varchar(255) default NULL,
  `storage_id` varchar(32) default NULL,
  `repair_stauts` enum('norepair','alreadyrepair') default NULL,
  `repair_grade` enum('grave','middling','commonly') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`repair_id`),
  KEY `FK_storage_repair_storage_storage_id` (`storage_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ֿ�ά�޹���';

-- ----------------------------
-- Records of t_storehouse_storage_repair
-- ----------------------------
INSERT INTO `t_storehouse_storage_repair` VALUES ('e0d4af1c5ff56bd42dbc29c057d419f2', '空调故障', '第三方国大润发鬼地方', '48216dbd85198dbeb95f253ad0215c3c', 'alreadyrepair', 'middling', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:20:57', '8b25651c2d896297530b64e4b80ec503', '2014-10-17 14:36:58');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` varchar(32) NOT NULL,
  `username` varchar(20) NOT NULL,
  `user_cn_name` varchar(50) default NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(50) default NULL,
  `status` enum('disable','enable') NOT NULL,
  `builtin` enum('custom','builtin','admin') NOT NULL,
  `email` varchar(50) default NULL,
  `user_image` varchar(50) default NULL,
  `remark` varchar(255) default NULL,
  `last_login_time` datetime default NULL,
  `last_login_ip_address` varchar(150) default NULL,
  `login_count` int(10) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2014-10-22 09:52:01', '127.0.0.1[本地]', '1105', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
INSERT INTO `t_user` VALUES ('d31a15b0c9abe32744dc16203b9547d8', 'administrators', '客户管理员', 'f418eabf12e35e6112d8783ef6751c0da68782b5', 'd5a18894f8d85631', 'enable', 'custom', 'administrators@qq.com', null, '后台管理员', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-07-28 16:30:17');
INSERT INTO `t_user` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', 'adminTest', '客户管理员', 'd7d62bc0a343ffea509247f1a7c92120e762771d', 'baaa252597ec918e', 'enable', 'custom', 'adminTest@163.com', null, '客户、测试使用账号', '2014-08-04 17:53:34', '127.0.0.1[本地]', '4', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:40:42');

-- ----------------------------
-- Table structure for `t_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `role_id` varchar(32) NOT NULL COMMENT '角色Id',
  PRIMARY KEY  (`user_id`,`role_id`),
  KEY `FK_t_user_role2` (`role_id`),
  CONSTRAINT `FK_t_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`),
  CONSTRAINT `FK_t_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('d31a15b0c9abe32744dc16203b9547d8', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', 'c87dd7161dbf8777c41b8cbfaa985db4');

-- ----------------------------
-- Table structure for `t_user_setting`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_setting`;
CREATE TABLE `t_user_setting` (
  `user_id` varchar(32) NOT NULL,
  `set_key` varchar(50) default NULL,
  `set_name` varchar(50) default NULL,
  `set_value` varchar(255) default NULL,
  `set_description` varchar(255) default NULL,
  PRIMARY KEY  (`user_id`),
  CONSTRAINT `FK_user_user_setting_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_setting
-- ----------------------------

-- ----------------------------
-- Table structure for `t_website_advertisement`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_advertisement`;
CREATE TABLE `t_website_advertisement` (
  `web_adv_id` varchar(32) NOT NULL,
  `web_adv_theme` varchar(100) default NULL,
  `web_adv_content` text,
  `web_adv_status` enum('enable','disable') default NULL COMMENT 'dsafsdafasdfd',
  `clicks` int(11) default NULL,
  `accessory` varchar(255) default NULL,
  `web_adv_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_adv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的网站广告表。';

-- ----------------------------
-- Records of t_website_advertisement
-- ----------------------------
INSERT INTO `t_website_advertisement` VALUES ('ff2295894bad92777fb28caf90d05908', '2013年人民币汇率41次创新高 2014年或仍将升值】', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a>', 'enable', '0', null, '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:32', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:32');

-- ----------------------------
-- Table structure for `t_website_announcement`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_announcement`;
CREATE TABLE `t_website_announcement` (
  `web_ann_id` varchar(32) NOT NULL,
  `web_ann_theme` varchar(100) default NULL,
  `web_ann_content` text,
  `web_ann_status` enum('enable','disable') default NULL COMMENT 'dsafsdafasdfd',
  `clicks` int(11) default NULL,
  `accessory` varchar(255) default NULL,
  `web_ann_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_ann_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的网站公告表。';

-- ----------------------------
-- Records of t_website_announcement
-- ----------------------------
INSERT INTO `t_website_announcement` VALUES ('6f4364db610a43e36927f0c55d903631', '关于8月5日凌晨零点临时维护公告', '由于系统更新升级，于8月5日凌晨零点，将暂停系统服务，在此期间网站将停止访问，给您带来的不便请谅解。<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\"></a>', 'enable', '7', null, '7', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:11', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 13:35:43');

-- ----------------------------
-- Table structure for `t_website_help`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_help`;
CREATE TABLE `t_website_help` (
  `web_help_id` varchar(32) NOT NULL,
  `web_help_theme` varchar(100) default NULL,
  `web_help_content` text,
  `web_help_type` enum('borrow','invest','fund') default NULL,
  `web_help_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_cla_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_help_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的帮助中心表。';

-- ----------------------------
-- Records of t_website_help
-- ----------------------------
INSERT INTO `t_website_help` VALUES ('165f89c9b030fe9c2726e1f6ce2e57bb', '冰川贷公司斩获2013中关村十大评选两项大奖 ', '					\r\n				', 'borrow', 'enable', '', '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:35:36', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:10:35');

-- ----------------------------
-- Table structure for `t_website_hiring`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_hiring`;
CREATE TABLE `t_website_hiring` (
  `web_hiring_id` varchar(32) NOT NULL,
  `web_hiring_theme` varchar(100) default NULL,
  `web_hiring_content` text,
  `web_hiring_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_hiring_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_hiring_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的招聘管理表。';

-- ----------------------------
-- Records of t_website_hiring
-- ----------------------------
INSERT INTO `t_website_hiring` VALUES ('34561fa9f66ac61df8e98ea2391341e6', ' 文案   ', '职位描述：<br />\r\n<br />\r\n&nbsp;<br />\r\n<br />\r\n1、起草审查协议合同；<br />\r\n2、项目谈判过程中法律与道德风险规避；<br />\r\n3、平台合作机构的分类整理记录；<br />\r\n4、上级安排的其他工作；<br />\r\n<br />\r\n<br />\r\n&nbsp;<br />\r\n<br />\r\n任职要求:<br />\r\n<br />\r\n&nbsp;<br />\r\n<br />\r\n1、较好的文字功底；<br />\r\n2、工作细心认真，对互联网金融有一定认识；<br />\r\n3、较好的团队合作意识，较强的抗压能力；<br />\r\n4、法律专业优先。 <br />', 'enable', '', '3', 'sf', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:29', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 14:48:33');
INSERT INTO `t_website_hiring` VALUES ('7777a1a9f65a86675dcc82ca4f574f7b', '软件开发项目经理（JAVA)', '一、工作职责：<br />\r\n<br />\r\n1、负责软件项目的管理和实施；<br />\r\n<br />\r\n2、具备很强管理、协调及沟通能力，制定开发计划，跟踪开发任务，保证开发进度及品质，说明开发人员解决开发过程中遇到的技术问题，做好日常的开发团队管理工作；<br />\r\n<br />\r\n3、具备较强的分析问题、解决问题的能力，能够解决项目团队在开发过程中遇到的技术难题。<br />\r\n<br />\r\n二、任职要求：<br />\r\n<br />\r\n1、计算机等相关专业，3年以上JAVA软件从业经验，1年以上开发经理或团队管理经验；<br />\r\n<br />\r\n2、精通JAVA程式设计语言，精通SSH等常用框架；<br />\r\n<br />\r\n3、精通JAVA，STRUCTS，SPRING，Hibermate体系架构，有较好的程式设计和应用经验，有后台服务端的设计经验，能够使用PowerDesigner、Visio、Project等工具；<br />\r\n<br />\r\n4、快速适应工作环境，应变能力强，抗压能力强，有较强的责任心；<br />\r\n<br />\r\n5、有银行从业经验及相关项目实施经验。<br />', 'enable', '', '2', 'asdasdf', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:53:13', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 14:50:47');
INSERT INTO `t_website_hiring` VALUES ('7bacad18f86870b6c6ae4f1d94ec8902', '新媒体营销专员', '&nbsp;<br />\r\n职位描述：<br />\r\n<br />\r\n&nbsp;<br />\r\n<br />\r\n1、对公众微信、微博进行管理维护；<br />\r\n2、根据公司要求进行微信、微博的发帖和互动；<br />\r\n3、定期策划微信的互动营销活动、专题活动；<br />\r\n4、定期总结分析推广效果，分析数据并改进运营策略。<br />\r\n<br />\r\n<br />\r\n&nbsp;<br />\r\n<br />\r\n任职要求:<br />\r\n<br />\r\n&nbsp;<br />\r\n<br />\r\n1、大专以上学历，具有1年或以上营销推广、微博运营等相关工作经验，面试时需提供推广成果演示；<br />\r\n2、有高度的责任心，对微信等新生互联网事物兴趣浓厚；<br />\r\n3、对微博信息内容有一定理解,工作认真、负责、耐心、细致；<br />\r\n4、具备较强的逻辑分析能力、学习能力，创新能力，和良好的文字功底； <br />', 'enable', '', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:29:33', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 14:47:53');
INSERT INTO `t_website_hiring` VALUES ('86d2cabfc0253442feb472f3917f745d', 'Android 软件开发工程师', '任职要求：<br />\r\n1、应往届理工科毕业生，有志于在IT行业发展；<br />\r\n2、计算机（网络）、电子信息、软件工程、（电气）自动化、测控、生仪、机电等专业； <br />\r\n3、有计算机语言者优先，如：C语言、C++、Java、.Net等；<br />\r\n4、大学专科及以上学历，不限经验；<br />\r\n5、先培训后上岗，培训期间不用实际交纳任何费用，入职后年薪5万。<br />\r\n入职范围：<br />\r\nJava程序员软件开发工程师&nbsp; Android软件开发工程师 网络工程师 系统运维工程师<br />\r\n待遇：<br />\r\n签订正式劳动合同，享受国家规定的保险福利待遇，入职第一个月专科生起薪高于3500元、本科生高于4000元 ，工作三个月转正后，薪酬会达到5000元的平均水平，第二年起薪高于6000元/月，平均年薪6-10万元甚至更高。\r\n<p>\r\n	<br />\r\n</p>', 'enable', '', '1', 'dd', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 14:58:17', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 14:53:32');
INSERT INTO `t_website_hiring` VALUES ('db5c1fa9f66ac61df8e98ea2391341e6', '深圳·销售代表（市场部）', '岗位要求： <br />\r\n<br />\r\n1、年龄：20-32岁；性别：不限；语言：汉语流利；<br />\r\n2、大专及以上学历，二年以上工作经验； <br />\r\n3、熟悉互联网，有责任心，善于主动销售，有丰富的面对面沟通技巧； <br />\r\n4、熟悉Internet使用，熟练掌握计算机系统相关操作； <br />\r\n5、有团队合作意识。<br />\r\n&nbsp;<br />\r\n&nbsp;岗位职责:<br />\r\n<br />\r\n1、主动销售：联系客户，销售呼出，向新老客户推荐域名、主机、网站推广等相关产品；<br />\r\n2、续租呼出：续租呼出，对老客户进行续租催费工作；<br />\r\n3、销售任务：承担并完成当月销售任务。<br />\r\n&nbsp;<br />\r\n应聘电话：0755－2775 9293&nbsp; 人事邮箱：glaciersoft@eims.com.cn <br />\r\n<br />', 'enable', '', '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:44', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 14:46:59');

-- ----------------------------
-- Table structure for `t_website_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_link`;
CREATE TABLE `t_website_link` (
  `web_link_id` varchar(32) NOT NULL,
  `web_link_name` varchar(100) default NULL,
  `web_link_url` varchar(100) default NULL,
  `web_link_photo` varchar(100) default NULL,
  `web_link_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_link_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的友情链接表。';

-- ----------------------------
-- Records of t_website_link
-- ----------------------------
INSERT INTO `t_website_link` VALUES ('4fc1c2b44ceb087b3fc4faf4831a9f20', '中意电子商务有限公司', 'www.zhongyidianzi.com', 'C://photo', 'enable', null, '3', '中移电子商务有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:55', '8b25651c2d896297530b64e4b80ec503', '2014-08-07 09:25:57');
INSERT INTO `t_website_link` VALUES ('63070b421c95338eedbca0127e8b382d', '百度一下', 'www.baidu.com', 'C://photo', 'enable', null, '2', '百度一下', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:32:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:34:04');
INSERT INTO `t_website_link` VALUES ('cc4342755eb8ee1d5d106188a44745a3', '支付宝网络科技（上海）有限公司', 'www.zhifubao.com', 'C://photo', 'enable', null, '4', '支付宝网络科技（上海）有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:16', '8b25651c2d896297530b64e4b80ec503', '2014-08-07 17:42:45');
INSERT INTO `t_website_link` VALUES ('cf384296b4cc0904afd6f152752362eb', '冰川软件', 'www.glaciersoft.cn/index.html', 'C://photo', 'enable', null, '1', '冰川软件', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:31:02', '8b25651c2d896297530b64e4b80ec503', '2014-08-05 14:55:22');
INSERT INTO `t_website_link` VALUES ('e13efd6adffe6fa43b589c1f07779bd1', '迅付信息科技有限公司', 'www.ips.com/Default.html', 'C://photo', 'enable', null, '5', '迅付信息科技有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:37', '8b25651c2d896297530b64e4b80ec503', '2014-08-07 09:27:52');

-- ----------------------------
-- Table structure for `t_website_nav`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_nav`;
CREATE TABLE `t_website_nav` (
  `web_nav_id` varchar(32) NOT NULL,
  `web_nav_pid` varchar(32) default NULL,
  `web_nav_name` varchar(100) default NULL,
  `web_nav_url` varchar(100) default NULL,
  `web_nav_status` enum('enable','disable') default NULL,
  `web_nav_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_nav_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的导航管理表。';

-- ----------------------------
-- Records of t_website_nav
-- ----------------------------
INSERT INTO `t_website_nav` VALUES ('00d7c3855dc4e12a31ee013b8d5aacfd', '6c0cb4c77e2cc5a3bfa47d79023c5254', '发货流程', '/', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:01:54', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:01:54');
INSERT INTO `t_website_nav` VALUES ('0a69398099f328b5b65e1cfebdabc652', '35636f2a16d4604fa3b53fcd5c2d662e', '物流展会', '/', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:49:45', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:19:36');
INSERT INTO `t_website_nav` VALUES ('0d9e59eb08fd1bf0ca9256f71ef82c18', null, '班线查询', '/', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:11:44', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:11:44');
INSERT INTO `t_website_nav` VALUES ('0e68817baeba1109fbcfd53c837dbc66', '533321196059fa5805661651134a58fe', '联系我们', '/contactUs.htm', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:51', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:19:53');
INSERT INTO `t_website_nav` VALUES ('133ccad08d70daf73b77fb8fb1bcee0c', null, '首页', '/index.htm', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:43:48', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:36:16');
INSERT INTO `t_website_nav` VALUES ('1d33d5a8b6d5a2fe73eb78b7c8439624', '533321196059fa5805661651134a58fe', '公司简介', '/aboutUs.htm', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:36', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:07');
INSERT INTO `t_website_nav` VALUES ('28cd4d77a1b0bd7caa226dc4a0361d38', '533321196059fa5805661651134a58fe', '网站公告', '/announcement/announcement.htm?&p=1', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-09-28 16:22:09', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:16');
INSERT INTO `t_website_nav` VALUES ('35636f2a16d4604fa3b53fcd5c2d662e', null, '综合消息', '/', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:46:07', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:12:04');
INSERT INTO `t_website_nav` VALUES ('42bdcfbb624c975eea75c7d06b943853', '533321196059fa5805661651134a58fe', '招聘信息', '/hiring/hiring.htm?&p=1', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:50:02', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:11');
INSERT INTO `t_website_nav` VALUES ('4edb2ec67480c21811ddb0b16f0e5218', null, '个人中心', 'accountNumber', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:34', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:29:02');
INSERT INTO `t_website_nav` VALUES ('533321196059fa5805661651134a58fe', null, '关于我们', '  ', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:12', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:14:20');
INSERT INTO `t_website_nav` VALUES ('569777bf096ad92a80cc2540fbc56200', '35636f2a16d4604fa3b53fcd5c2d662e', '物流招标投标', '/', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:47:47', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 13:52:18');
INSERT INTO `t_website_nav` VALUES ('5b89145fb9ba02e8fb6097f7eb25c4fd', '35636f2a16d4604fa3b53fcd5c2d662e', '政府', '/', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:48:32', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:48:32');
INSERT INTO `t_website_nav` VALUES ('5f76cc51c5d787932f09c4425350a79a', '4edb2ec67480c21811ddb0b16f0e5218', '我要登录', '/login.htm', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:46', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:43');
INSERT INTO `t_website_nav` VALUES ('6c0cb4c77e2cc5a3bfa47d79023c5254', null, '帮助中心', '  ', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:59', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:14:33');
INSERT INTO `t_website_nav` VALUES ('8a7e02ccfbb5aa3eee07f60962be7f3b', '35636f2a16d4604fa3b53fcd5c2d662e', '交易中心', '/', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:47:31', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 13:52:23');
INSERT INTO `t_website_nav` VALUES ('96afe3182d63a4d0055f93e4fc85f6bb', '6c0cb4c77e2cc5a3bfa47d79023c5254', '退货流程', '/', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:03:17', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 11:03:17');
INSERT INTO `t_website_nav` VALUES ('9e679d8e3c7caeec65bf0d26f7445484', '6c0cb4c77e2cc5a3bfa47d79023c5254', '物流案例', '/', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:56:04', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:56:04');
INSERT INTO `t_website_nav` VALUES ('9fc15c1d60339e7c6f6046b05f4c0e82', null, '我要发货', '/', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:42:02', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 13:58:22');
INSERT INTO `t_website_nav` VALUES ('b2fdf2c99c698706657dc90a7bd75434', '533321196059fa5805661651134a58fe', '关于物联网', '/', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:55:19', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:21');
INSERT INTO `t_website_nav` VALUES ('b45b9148c7cd2b5f7ec1d53a3d6ec99f', '4edb2ec67480c21811ddb0b16f0e5218', '我要注册', '/intoregister.htm', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:59', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:48');
INSERT INTO `t_website_nav` VALUES ('b52cdfda559d22db2892358a98cda669', '35636f2a16d4604fa3b53fcd5c2d662e', '园区', '/', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:48:49', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:48:49');
INSERT INTO `t_website_nav` VALUES ('b5e2908727bd92d79642955ecba704e4', '35636f2a16d4604fa3b53fcd5c2d662e', '政策法规', '/', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:50:27', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:50:27');
INSERT INTO `t_website_nav` VALUES ('be07bc625b63b751fb320c074dd7bee0', 'f6cd3e0522375f4b726799ab0089990c', '退货处理', '/', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:43:12', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:20:38');
INSERT INTO `t_website_nav` VALUES ('d08dd46403bbe054ed26217990681869', null, '订单查询', '/', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:40:13', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:10:59');
INSERT INTO `t_website_nav` VALUES ('e1a96a4299939eee457cfed479d1f81f', '35636f2a16d4604fa3b53fcd5c2d662e', '站内消息', '/', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:46:40', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:46:40');
INSERT INTO `t_website_nav` VALUES ('f6cd3e0522375f4b726799ab0089990c', null, '产品服务', ' ', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:32:41', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 14:13:47');
INSERT INTO `t_website_nav` VALUES ('fcf45dc752140e0111b576aafcd7d87d', '6c0cb4c77e2cc5a3bfa47d79023c5254', '招商合作', '/', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:52:11', '8b25651c2d896297530b64e4b80ec503', '2014-10-10 10:52:11');

-- ----------------------------
-- Table structure for `t_website_news`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_news`;
CREATE TABLE `t_website_news` (
  `web_news_id` varchar(32) NOT NULL,
  `web_news_theme` varchar(100) default NULL,
  `web_news_content` text,
  `web_news_status` enum('enable','disable') default NULL,
  `web_news_num` int(11) default NULL,
  `type` enum('airlift','land','trade','sea') default NULL COMMENT '新闻类型：海运、空运、陆运、贸易、',
  `accessory` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的新闻管理表。';

-- ----------------------------
-- Records of t_website_news
-- ----------------------------
INSERT INTO `t_website_news` VALUES ('d2321b66d4cdde4bb7f961bbcec9dfc6', '十五年一遇的双情人节，大家准备好了吗？', '十五年一遇的双情人节，大家准备好了吗？<img src=\"http://localhost:8888/global-webapp/resources/upload/image/20141013/20141013093239_948.jpg\" alt=\"\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/28.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/63.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/65.gif\" alt=\"\" border=\"0\" />', 'enable', '2', 'airlift', '3', '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:40', '8b25651c2d896297530b64e4b80ec503', '2014-10-13 09:32:41');

-- ----------------------------
-- Table structure for `t_website_service`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_service`;
CREATE TABLE `t_website_service` (
  `web_service_id` varchar(32) NOT NULL,
  `web_service_name` varchar(100) default NULL,
  `web_service_qq` varchar(100) default NULL,
  `web_service_photo` varchar(100) default NULL,
  `web_service_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_service_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的客服管理表。';

-- ----------------------------
-- Records of t_website_service
-- ----------------------------
INSERT INTO `t_website_service` VALUES ('5b09aad291adf5a4c6f4be3c6b3a195c', '客服2', '406592176', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135452_164.jpg', 'enable', '', '2', '前台', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:47', '8b25651c2d896297530b64e4b80ec503', '2014-10-09 13:39:30');
INSERT INTO `t_website_service` VALUES ('9709efd442475ce555cfeeb3f26294ab', '客服4', '1203807137', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135419_328.jpg', 'enable', '', '4', '售后', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:37', '8b25651c2d896297530b64e4b80ec503', '2014-10-09 13:39:13');
INSERT INTO `t_website_service` VALUES ('f94e462f10af076f92459eff090968ab', '客服1', '920339213', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135502_288.jpg', 'enable', '', '1', '前台\r\n', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:04', '8b25651c2d896297530b64e4b80ec503', '2014-10-09 13:39:38');
INSERT INTO `t_website_service` VALUES ('fbb3e704f860029e3be51a0b8501e37f', '客服3', '985776597', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135432_643.jpg', 'enable', '3', '3', '后台', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:08', '8b25651c2d896297530b64e4b80ec503', '2014-10-09 13:39:21');
