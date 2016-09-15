create index IX_A2BC5BE5 on opencps_acc_business (email);
create index IX_E5CA303 on opencps_acc_business (groupId);
create index IX_17DEDC0C on opencps_acc_business (groupId, accountStatus);
create index IX_159CC7F8 on opencps_acc_business (groupId, accountStatus, cityCode);
create index IX_1C23E4DB on opencps_acc_business (groupId, accountStatus, districtCode);
create index IX_23E19051 on opencps_acc_business (groupId, businessType);
create index IX_74636482 on opencps_acc_business (groupId, name);
create index IX_4BB0CAD on opencps_acc_business (groupId, name, accountStatus);
create index IX_1A863C65 on opencps_acc_business (mappingOrganizationId);
create index IX_C3B03FD on opencps_acc_business (mappingUserId);
create index IX_FF351A4D on opencps_acc_business (uuid_);

create index IX_91A56255 on opencps_acc_business_account (groupId);
create index IX_F1CCC384 on opencps_acc_business_account (groupId, businessId);

create index IX_98E94DF0 on opencps_acc_businessdomain (businessDomainCode);
create index IX_68B9F8BA on opencps_acc_businessdomain (businessId);

create index IX_5096979F on opencps_acc_citizen (email);
create index IX_AE96D83D on opencps_acc_citizen (groupId);
create index IX_A604B92 on opencps_acc_citizen (groupId, accountStatus);
create index IX_B41507FE on opencps_acc_citizen (groupId, accountStatus, cityCode);
create index IX_44D0B1E1 on opencps_acc_citizen (groupId, accountStatus, districtCode);
create index IX_109304F on opencps_acc_citizen (groupId, accountStatus, wardCode);
create index IX_86AB362B on opencps_acc_citizen (groupId, fullName);
create index IX_3B0293E4 on opencps_acc_citizen (groupId, fullName, accountStatus);
create index IX_BF62E5B7 on opencps_acc_citizen (mappingUserId);
create index IX_AD0F5607 on opencps_acc_citizen (uuid_);

create index IX_8DDA2397 on opencps_actionhistory (groupId, processOrderId);
create index IX_9804534F on opencps_actionhistory (processOrderId);
create index IX_9B1108CA on opencps_actionhistory (processOrderId, processWorkflowId);

create index IX_DC1C9C95 on opencps_api_log (apiCode);
create index IX_FE943A05 on opencps_api_log (apiCode, oid);
create index IX_F7548C78 on opencps_api_log (oid);

create unique index IX_A1CCE6BC on opencps_dictcollection (collectionCode);
create index IX_ABBCA0ED on opencps_dictcollection (groupId);
create index IX_CEFDFB4C on opencps_dictcollection (groupId, collectionCode);
create index IX_E102186A on opencps_dictcollection (groupId, collectionName);

create index IX_6426BE35 on opencps_dictitem (dictCollectionId);
create index IX_3B3FCE89 on opencps_dictitem (dictCollectionId, itemCode);
create index IX_4D43EBA7 on opencps_dictitem (dictCollectionId, itemName);
create index IX_941A2A41 on opencps_dictitem (dictCollectionId, parentItemId);
create index IX_671DB1DB on opencps_dictitem (dictVersionId);
create index IX_EE530E66 on opencps_dictitem (itemCode);
create index IX_9A0339E on opencps_dictitem (parentItemId);
create index IX_55F7D4F2 on opencps_dictitem (treeIndex);

create index IX_B35724E8 on opencps_dictversion (dictCollectionId);

create index IX_25786697 on opencps_dossier (delayStatus);
create index IX_FCD17496 on opencps_dossier (delayStatus, dossierStatus);
create index IX_E8004DFC on opencps_dossier (groupId);
create index IX_992B3691 on opencps_dossier (groupId, dossierStatus);
create index IX_D2156DCB on opencps_dossier (groupId, dossierStatus, userId);
create index IX_9A7DEA36 on opencps_dossier (groupId, userId);
create index IX_6C5D93CC on opencps_dossier (oid);
create index IX_C4F61572 on opencps_dossier (receptionNo);
create index IX_577EF680 on opencps_dossier (serviceInfoId);

create index IX_A490E01D on opencps_dossier_file (dossierId);
create index IX_67263BCC on opencps_dossier_file (dossierId, dossierPartId);
create index IX_8A78397A on opencps_dossier_file (dossierId, dossierPartId, groupFileId);
create index IX_75A4E0C9 on opencps_dossier_file (dossierId, groupFileId);
create index IX_F19A3712 on opencps_dossier_file (dossierId, syncStatus, removed);
create index IX_F6264B48 on opencps_dossier_file (dossierId, templateFileNo);
create index IX_71A2C206 on opencps_dossier_file (groupFileId, dossierId, syncStatus, removed);
create index IX_631CFB61 on opencps_dossier_file (oid);

create index IX_61E07DE3 on opencps_dossier_log (dossierId);
create index IX_54844422 on opencps_dossier_log (dossierId, actor);
create index IX_3C367013 on opencps_dossier_log (dossierId, requestCommand);
create index IX_FD62C304 on opencps_dossier_log (dossierId, syncStatus);

create index IX_2FBACF27 on opencps_dossier_status (dossierId);
create index IX_291423C7 on opencps_dossier_status (dossierId, fileGroupId);

create index IX_34587ACF on opencps_dossierpart (dossierTemplateId);
create index IX_5CCFE928 on opencps_dossierpart (dossierTemplateId, parentId);
create index IX_BB2D2F83 on opencps_dossierpart (dossierTemplateId, parentId, groupId, partType);
create index IX_924FA8A9 on opencps_dossierpart (dossierTemplateId, parentId, partType);
create index IX_5D092757 on opencps_dossierpart (dossierTemplateId, partNo);
create index IX_4A479590 on opencps_dossierpart (dossierTemplateId, partType);
create index IX_E564EB83 on opencps_dossierpart (dossierTemplateId, sibling);
create index IX_6BCC317A on opencps_dossierpart (parentId);
create index IX_4DB338F3 on opencps_dossierpart (partName);
create index IX_80BF5C29 on opencps_dossierpart (partNo);
create index IX_B734E454 on opencps_dossierpart (templateFileNo, partNo);

create index IX_BD9EF942 on opencps_dossiertemplate (groupId);
create index IX_EF78FD41 on opencps_dossiertemplate (templateName);
create index IX_E225DBF7 on opencps_dossiertemplate (templateNo);

create index IX_D6FF3693 on opencps_employee (groupId);
create index IX_A8503959 on opencps_employee (groupId, email);
create index IX_FFDB99D6 on opencps_employee (groupId, employeeNo);
create index IX_4B8A2101 on opencps_employee (groupId, fullName);
create index IX_8B06C1DF on opencps_employee (groupId, fullName, workingUnitId);
create index IX_11A42D71 on opencps_employee (groupId, mappingUserId);
create index IX_A355960D on opencps_employee (groupId, workingUnitId);
create index IX_99B0802C on opencps_employee (groupId, workingUnitId, mainJobPosId);
create index IX_62C50C96 on opencps_employee (mainJobPosId);
create index IX_DA961429 on opencps_employee (workingUnitId);

create index IX_253CEBA8 on opencps_employee_jobpos (employeeId);
create index IX_9F27E111 on opencps_employee_jobpos (jobPosId);

create index IX_3B08FB51 on opencps_file_group (dossierId);
create index IX_A3919FAC on opencps_file_group (dossierId, displayName);
create index IX_45B5D218 on opencps_file_group (dossierId, dossierPartId);

create index IX_F3E0B05E on opencps_jobpos (groupId, title);
create index IX_D8DDECE2 on opencps_jobpos (groupId, title, workingUnitId);
create index IX_9EE39C56 on opencps_jobpos (groupId, workingUnitId);
create index IX_FC1150C1 on opencps_jobpos (groupId, workingUnitId, directWorkingUnitId);
create index IX_CBDF27C0 on opencps_jobpos (workingUnitId);

create index IX_A17BF2AB on opencps_payment_config (groupId, govAgencyOrganizationId);

create index IX_32675A98 on opencps_payment_file (dossierId);
create index IX_4FC926B0 on opencps_payment_file (dossierId, paymentStatus);
create index IX_E88DCA53 on opencps_payment_file (groupId, keypayGoodCode);
create index IX_F67DC25 on opencps_payment_file (keypayGoodCode);
create index IX_430EEC02 on opencps_payment_file (keypayTransactionId);
create index IX_A233EED5 on opencps_payment_file (keypayTransactionId, keypayGoodCode, amount);
create index IX_4813AE1C on opencps_payment_file (oid);
create index IX_143C8E6A on opencps_payment_file (paymentStatus);
create index IX_E421F5D6 on opencps_payment_file (uuid_);
create index IX_3C7D2C92 on opencps_payment_file (uuid_, companyId);
create unique index IX_522BAF94 on opencps_payment_file (uuid_, groupId);

create index IX_84FEFDA0 on opencps_processorder (dossierId, fileGroupId);
create index IX_D2C760BE on opencps_processorder (processStepId);
create index IX_6E81FFE6 on opencps_processorder (serviceInfoId);

create index IX_749A078C on opencps_processstep (groupId);
create index IX_BCCDB27A on opencps_processstep (groupId, processStepId);
create index IX_2D87C7C7 on opencps_processstep (serviceProcessId);

create index IX_F878B349 on opencps_processstep_dossierpart (processStepId);

create index IX_74521288 on opencps_processworkflow (actionCode);
create index IX_95239B3A on opencps_processworkflow (serviceProcessId);
create index IX_DC0BA808 on opencps_processworkflow (serviceProcessId, autoEvent, preProcessStepId);
create index IX_EE28364C on opencps_processworkflow (serviceProcessId, postProcessStepId);
create index IX_E0E74F61 on opencps_processworkflow (serviceProcessId, preProcessStepId);
create index IX_5B2365F6 on opencps_processworkflow (serviceProcessId, preProcessStepId, actionName);

create index IX_FEB81E42 on opencps_scheduler_jobs (schedulerType);

create index IX_16392C5B on opencps_service_config (dossierTemplateId);
create index IX_3CD8B959 on opencps_service_config (groupId, serviceInfoId);
create index IX_13AD18F7 on opencps_service_config (groupId, serviceInfoId, govAgencyCode);
create index IX_C60DA2AC on opencps_service_config (groupId, serviceInfoId, serviceAdministrationIndex);
create index IX_6AD5F993 on opencps_service_config (groupId, serviceMode);
create index IX_4E2E2A51 on opencps_service_config (serviceInfoId, groupId);

create index IX_2D7640E5 on opencps_service_templatefile (serviceinfoId);
create index IX_AB0DFA6E on opencps_service_templatefile (templatefileId);

create index IX_29AD8B64 on opencps_serviceinfo (groupId);
create index IX_9CE4B7CF on opencps_serviceinfo (groupId, administrationCode, activeStatus);
create index IX_A7FF6335 on opencps_serviceinfo (groupId, domainCode, activeStatus);
create index IX_5A05F23A on opencps_serviceinfo (groupId, domainIndex);
create index IX_74B6A6EE on opencps_serviceinfo (uuid_);
create index IX_D3675C7A on opencps_serviceinfo (uuid_, companyId);
create unique index IX_D630B97C on opencps_serviceinfo (uuid_, groupId);

create index IX_E86B675E on opencps_serviceinfoprocess (serviceProcessId);
create index IX_CFBAAF70 on opencps_serviceinfoprocess (serviceProcessId, serviceinfoId);
create unique index IX_C3183FB9 on opencps_serviceinfoprocess (serviceinfoId);

create index IX_D00EB5E7 on opencps_serviceprocess (groupId);
create index IX_309B84C9 on opencps_serviceprocess (groupId, dossierTemplateId);

create index IX_83FA2337 on opencps_stepallowance (processStepId);
create index IX_D308074D on opencps_stepallowance (processStepId, readOnly);
create index IX_49969B9C on opencps_stepallowance (processStepId, roleId);
create index IX_7DC794D4 on opencps_stepallowance (roleId);

create index IX_9B1F2666 on opencps_templatefile (groupId, fileName);
create index IX_EB1E0A5C on opencps_templatefile (groupId, fileNo);

create index IX_3C5D55D0 on opencps_workflowoutput (processWorkflowId);
create index IX_2CF5DA02 on opencps_workflowoutput (processWorkflowId, esign);
create index IX_F146748B on opencps_workflowoutput (processWorkflowId, postback);

create index IX_9A8B4974 on opencps_workingunit (email);
create index IX_4E2668D2 on opencps_workingunit (groupId);
create index IX_F35D685E on opencps_workingunit (groupId, govAgencyCode);
create index IX_307C910B on opencps_workingunit (groupId, isEmployer);
create index IX_3D4F284B on opencps_workingunit (groupId, isEmployer, parentWorkingUnitId);
create unique index IX_DCF950E1 on opencps_workingunit (groupId, mappingOrganisationId);
create index IX_54F5C2E4 on opencps_workingunit (groupId, parentWorkingUnitId);

create index IX_D9D46450 on opencps_workingunit_jobpos (jobPosId);
create index IX_3A1EDA16 on opencps_workingunit_jobpos (workingunitId);