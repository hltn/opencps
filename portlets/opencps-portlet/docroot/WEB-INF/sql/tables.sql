create table opencps_acc_business (
	businessId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	uuid_ VARCHAR(75) null,
	name VARCHAR(75) null,
	enName VARCHAR(75) null,
	shortName VARCHAR(75) null,
	businessType VARCHAR(75) null,
	idNumber VARCHAR(75) null,
	address VARCHAR(75) null,
	cityCode VARCHAR(75) null,
	districtCode VARCHAR(75) null,
	wardCode VARCHAR(75) null,
	telNo VARCHAR(75) null,
	email VARCHAR(75) null,
	representativeName VARCHAR(75) null,
	representativeRole VARCHAR(75) null,
	attachFile LONG,
	mappingOrganizationId LONG,
	mappingUserId LONG,
	accountStatus INTEGER
);

create table opencps_acc_business_account (
	businessAccountId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	businessId LONG,
	fullName VARCHAR(75) null,
	workingRole VARCHAR(75) null,
	telNo VARCHAR(75) null,
	email VARCHAR(75) null,
	mappingUserId LONG,
	hasPermissions VARCHAR(75) null,
	accountStatus INTEGER
);

create table opencps_acc_businessdomain (
	domainId LONG not null primary key,
	businessId LONG,
	businessDomainCode VARCHAR(75) null
);

create table opencps_acc_citizen (
	citizenId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	uuid_ VARCHAR(75) null,
	fullName VARCHAR(75) null,
	personalId VARCHAR(75) null,
	gender INTEGER,
	birthdate DATE null,
	address VARCHAR(75) null,
	cityCode VARCHAR(75) null,
	districtCode VARCHAR(75) null,
	wardCode VARCHAR(75) null,
	telNo VARCHAR(75) null,
	email VARCHAR(75) null,
	attachFile LONG,
	mappingUserId LONG,
	accountStatus INTEGER
);

create table opencps_actionhistory (
	actionHistoryId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	processOrderId LONG,
	processWorkflowId LONG,
	actionDatetime DATE null,
	stepName VARCHAR(75) null,
	actionName VARCHAR(75) null,
	actionNote VARCHAR(75) null,
	actionUserId LONG,
	daysDoing INTEGER,
	daysDelay INTEGER
);

create table opencps_api_log (
	apiLogId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	oid VARCHAR(75) null,
	apiCode VARCHAR(75) null,
	ipAddress VARCHAR(75) null,
	httpAgent VARCHAR(75) null,
	params STRING null,
	status VARCHAR(75) null
);

create table opencps_dictcollection (
	dictCollectionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	collectionCode VARCHAR(100) null,
	collectionName STRING null,
	description STRING null
);

create table opencps_dictitem (
	dictItemId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dictCollectionId LONG,
	itemCode VARCHAR(100) null,
	itemName STRING null,
	itemDescription STRING null,
	parentItemId LONG,
	treeIndex VARCHAR(75) null,
	issueStatus INTEGER,
	dictVersionId LONG
);

create table opencps_dictversion (
	dictVersionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dictCollectionId LONG,
	version VARCHAR(75) null,
	description STRING null,
	validatedFrom DATE null,
	validatedTo DATE null,
	issueStatus INTEGER
);

create table opencps_dossier (
	dossierId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	oid VARCHAR(75) null,
	externalRefNo VARCHAR(75) null,
	externalRefUrl STRING null,
	ownerOrganizationId LONG,
	serviceConfigId LONG,
	serviceInfoId LONG,
	serviceDomainIndex VARCHAR(75) null,
	serviceAdministrationIndex VARCHAR(75) null,
	dossierTemplateId LONG,
	govAgencyCode VARCHAR(75) null,
	govAgencyName VARCHAR(255) null,
	govAgencyOrganizationId LONG,
	serviceMode INTEGER,
	counter INTEGER,
	subjectId VARCHAR(100) null,
	subjectName VARCHAR(255) null,
	address VARCHAR(500) null,
	cityCode VARCHAR(75) null,
	cityName VARCHAR(255) null,
	districtCode VARCHAR(75) null,
	districtName VARCHAR(255) null,
	wardCode VARCHAR(75) null,
	wardName VARCHAR(255) null,
	contactName VARCHAR(255) null,
	contactTelNo VARCHAR(100) null,
	contactEmail VARCHAR(255) null,
	note VARCHAR(1000) null,
	submitDatetime DATE null,
	receiveDatetime DATE null,
	receptionNo VARCHAR(75) null,
	estimateDatetime DATE null,
	finishDatetime DATE null,
	dossierStatus VARCHAR(75) null,
	dossierSource INTEGER,
	keypayRedirectUrl VARCHAR(75) null,
	delayStatus INTEGER,
	folderId LONG
);

create table opencps_dossier_file (
	dossierFileId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierId LONG,
	oid VARCHAR(75) null,
	dossierPartId LONG,
	templateFileNo VARCHAR(75) null,
	groupFileId LONG,
	ownerUserId LONG,
	ownerOrganizationId LONG,
	govAgencyOrganizationId INTEGER,
	displayName VARCHAR(255) null,
	formData STRING null,
	fileEntryId LONG,
	dossierFileMark INTEGER,
	dossierFileType INTEGER,
	dossierFileNo VARCHAR(255) null,
	dossierFileDate DATE null,
	removed INTEGER,
	original INTEGER,
	syncStatus INTEGER,
	version INTEGER,
	signed BOOLEAN
);

create table opencps_dossier_log (
	dossierLogId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierId LONG,
	fileGroupId LONG,
	requestCommand VARCHAR(75) null,
	dossierStatus VARCHAR(75) null,
	actionInfo VARCHAR(255) null,
	messageInfo VARCHAR(1000) null,
	updateDatetime DATE null,
	level INTEGER,
	actor INTEGER,
	actorId LONG,
	actorName VARCHAR(75) null,
	syncStatus INTEGER
);

create table opencps_dossier_status (
	dossierStatusId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierId LONG,
	fileGroupId LONG,
	dossierStatus VARCHAR(75) null,
	actionInfo VARCHAR(75) null,
	messageInfo VARCHAR(75) null,
	updateDatetime DATE null,
	syncStatus INTEGER
);

create table opencps_dossierpart (
	dossierpartId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierTemplateId LONG,
	partNo VARCHAR(100) null,
	partName VARCHAR(500) null,
	partTip STRING null,
	partType INTEGER,
	parentId LONG,
	sibling DOUBLE,
	treeIndex VARCHAR(1000) null,
	formScript STRING null,
	formReport STRING null,
	sampleData STRING null,
	required BOOLEAN,
	templateFileNo VARCHAR(75) null
);

create table opencps_dossiertemplate (
	dossierTemplateId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	templateName VARCHAR(500) null,
	description STRING null,
	templateNo VARCHAR(100) null
);

create table opencps_employee (
	employeeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	workingUnitId LONG,
	employeeNo VARCHAR(75) null,
	fullName VARCHAR(255) null,
	gender INTEGER,
	birthdate DATE null,
	telNo VARCHAR(75) null,
	mobile VARCHAR(75) null,
	email VARCHAR(75) null,
	workingStatus INTEGER,
	mainJobPosId LONG,
	mappingUserId LONG
);

create table opencps_employee_jobpos (
	employeeId LONG not null,
	jobPosId LONG not null,
	primary key (employeeId, jobPosId)
);

create table opencps_file_group (
	fileGroupId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	oId VARCHAR(75) null,
	dossierId LONG,
	dossierPartId LONG,
	displayName VARCHAR(75) null,
	removed INTEGER,
	syncStatus INTEGER
);

create table opencps_jobpos (
	jobPosId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(255) null,
	description STRING null,
	workingUnitId LONG,
	directWorkingUnitId LONG,
	leader INTEGER,
	mappingRoleId LONG
);

create table opencps_payment_config (
	paymentConfigId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	govAgencyOrganizationId LONG,
	govAgencyName VARCHAR(75) null,
	govAgencyTaxNo VARCHAR(75) null,
	invoiceTemplateNo VARCHAR(75) null,
	invoiceIssueNo VARCHAR(75) null,
	invoiceLastNo VARCHAR(7) null,
	bankInfo VARCHAR(75) null,
	placeInfo VARCHAR(75) null,
	keypayDomain VARCHAR(75) null,
	keypayVersion VARCHAR(75) null,
	keypayMerchantCode VARCHAR(75) null,
	keypaySecureKey VARCHAR(75) null,
	reportTemplate VARCHAR(75) null
);

create table opencps_payment_file (
	uuid_ VARCHAR(75) null,
	paymentFileId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dossierId LONG,
	fileGroupId LONG,
	ownerUserId LONG,
	ownerOrganizationId LONG,
	govAgencyOrganizationId LONG,
	paymentName VARCHAR(75) null,
	requestDatetime DATE null,
	amount DOUBLE,
	requestNote VARCHAR(75) null,
	paymentOptions VARCHAR(75) null,
	keypayUrl VARCHAR(75) null,
	keypayTransactionId LONG,
	keypayGoodCode VARCHAR(20) null,
	keypayMerchantCode VARCHAR(75) null,
	bankInfo VARCHAR(75) null,
	placeInfo VARCHAR(75) null,
	paymentStatus INTEGER,
	paymentMethod INTEGER,
	confirmDatetime DATE null,
	confirmFileEntryId LONG,
	approveDatetime DATE null,
	accountUserName VARCHAR(75) null,
	approveNote VARCHAR(75) null,
	govAgencyTaxNo VARCHAR(75) null,
	invoiceTemplateNo VARCHAR(75) null,
	invoiceIssueNo VARCHAR(75) null,
	invoiceNo VARCHAR(75) null,
	syncStatus INTEGER,
	oid VARCHAR(75) null
);

create table opencps_processorder (
	processOrderId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceInfoId LONG,
	dossierTemplateId LONG,
	govAgencyCode VARCHAR(75) null,
	govAgencyName VARCHAR(75) null,
	govAgencyOrganizationId LONG,
	serviceProcessId LONG,
	dossierId LONG,
	fileGroupId LONG,
	processStepId LONG,
	actionUserId LONG,
	actionDatetime DATE null,
	actionNote VARCHAR(75) null,
	assignToUserId LONG,
	processWorkflowId LONG,
	dossierStatus VARCHAR(75) null,
	errorInfo VARCHAR(75) null
);

create table opencps_processstep (
	processStepId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceProcessId LONG,
	stepName VARCHAR(75) null,
	sequenceNo INTEGER,
	dossierStatus VARCHAR(75) null,
	daysDuration INTEGER,
	referenceDossierPartId LONG,
	externalAppUrl VARCHAR(75) null
);

create table opencps_processstep_dossierpart (
	processStepId LONG not null,
	dossierPartId LONG not null,
	primary key (processStepId, dossierPartId)
);

create table opencps_processworkflow (
	processWorkflowId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceProcessId LONG,
	preProcessStepId LONG,
	postProcessStepId LONG,
	autoEvent VARCHAR(75) null,
	actionName VARCHAR(75) null,
	assignUser BOOLEAN,
	actionUserId LONG,
	requestPayment BOOLEAN,
	paymentFee VARCHAR(1000) null,
	generateReceptionNo BOOLEAN,
	receptionNoPattern VARCHAR(75) null,
	generateDeadline BOOLEAN,
	deadlinePattern VARCHAR(75) null,
	isFinishStep BOOLEAN,
	preCondition VARCHAR(75) null,
	isMultipled BOOLEAN,
	actionCode VARCHAR(75) null
);

create table opencps_scheduler_jobs (
	schedulerJobsId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	dossierId LONG,
	fileGroupId LONG,
	processWorkflowId LONG,
	schedulerType INTEGER,
	shedulerPattern VARCHAR(75) null,
	status INTEGER
);

create table opencps_service_config (
	serviceConfigId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceInfoId LONG,
	serviceDomainIndex VARCHAR(75) null,
	serviceAdministrationIndex VARCHAR(75) null,
	dossierTemplateId LONG,
	govAgencyCode VARCHAR(75) null,
	govAgencyName VARCHAR(75) null,
	serviceInstruction STRING null,
	serviceLevel INTEGER,
	servicePortal BOOLEAN,
	serviceOnegate BOOLEAN,
	serviceBackoffice BOOLEAN,
	govAgencyOrganizationId LONG,
	serviceCitizen BOOLEAN,
	serviceBusinees BOOLEAN,
	serviceProcessId LONG,
	domainCode VARCHAR(75) null,
	serviceMode INTEGER,
	govAgencyIndex VARCHAR(75) null,
	serviceUrl STRING null
);

create table opencps_service_templatefile (
	serviceinfoId LONG not null,
	templatefileId LONG not null,
	primary key (serviceinfoId, templatefileId)
);

create table opencps_serviceinfo (
	uuid_ VARCHAR(75) null,
	serviceinfoId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceNo VARCHAR(75) null,
	serviceName VARCHAR(500) null,
	fullName VARCHAR(500) null,
	serviceProcess VARCHAR(75) null,
	serviceMethod VARCHAR(75) null,
	serviceDossier VARCHAR(75) null,
	serviceCondition VARCHAR(75) null,
	serviceDuration VARCHAR(75) null,
	serviceActors VARCHAR(75) null,
	serviceResults VARCHAR(75) null,
	serviceRecords VARCHAR(75) null,
	serviceFee VARCHAR(75) null,
	serviceInstructions VARCHAR(75) null,
	administrationCode VARCHAR(75) null,
	administrationIndex VARCHAR(75) null,
	domainCode VARCHAR(75) null,
	domainIndex VARCHAR(75) null,
	activeStatus INTEGER,
	hasTemplateFiles INTEGER,
	onlineUrl VARCHAR(1000) null
);

create table opencps_serviceinfoprocess (
	serviceProcessId LONG not null,
	serviceinfoId LONG not null,
	primary key (serviceProcessId, serviceinfoId)
);

create table opencps_serviceprocess (
	serviceProcessId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	processNo VARCHAR(75) null,
	processName VARCHAR(75) null,
	description VARCHAR(75) null,
	dossierTemplateId LONG
);

create table opencps_stepallowance (
	stepAllowanceId LONG not null primary key,
	processStepId LONG,
	roleId LONG,
	readOnly BOOLEAN
);

create table opencps_templatefile (
	templatefileId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	fileName VARCHAR(75) null,
	fileNo VARCHAR(75) null,
	fileEntryId LONG
);

create table opencps_workflowoutput (
	workflowOutputId LONG not null primary key,
	processWorkflowId LONG,
	dossierPartId LONG,
	required BOOLEAN,
	esign BOOLEAN,
	postback BOOLEAN
);

create table opencps_workingunit (
	workingunitId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(255) null,
	enName VARCHAR(255) null,
	govAgencyCode VARCHAR(75) null,
	managerWorkingUnitId LONG,
	parentWorkingUnitId LONG,
	sibling INTEGER,
	treeIndex VARCHAR(75) null,
	address VARCHAR(75) null,
	cityCode VARCHAR(75) null,
	districtCode VARCHAR(75) null,
	wardCode VARCHAR(75) null,
	telNo VARCHAR(75) null,
	faxNo VARCHAR(75) null,
	email VARCHAR(75) null,
	website STRING null,
	isEmployer BOOLEAN,
	mappingOrganisationId LONG
);

create table opencps_workingunit_jobpos (
	jobPosId LONG not null,
	workingunitId LONG not null,
	primary key (jobPosId, workingunitId)
);