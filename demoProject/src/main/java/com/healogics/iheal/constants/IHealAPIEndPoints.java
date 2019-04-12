package com.healogics.iheal.constants;

public final class IHealAPIEndPoints {

	private IHealAPIEndPoints() {
	}

	public static final String	authenticate					= "AuthService/api/v2/Authenticate";

	public static final String	authenticateInstance			= "AuthService/api/v2/AuthenticateInstance";

	public static final String	authenticateByToken				= "AuthService/api/v2/AuthenticateByToken";

	public static final String	userFacilityListGet				= "AuthService/api/v2/UserFacilityListGet";

	public static final String	userProfileGet					= "AuthService/api/v2/UserProfileGet";

	public static final String	patientLoad						= "PatientService/api/v1/PatientLoad";

	public static final String	calendarVisitListGet			= "VisitService/api/v1/CalendarVisitListGet";

	public static final String	visitStart						= "VisitService/api/v1/VisitStart";

	public static final String	visitListGet					= "VisitService/api/v1/VisitListGet";

	public static final String	visitEnd						= "VisitService/api/v1/VisitEnd";

	public static final String	woundListGet					= "WoundService/api/v1/WoundListGet";

	public static final String	woundAssessmentListGet			= "WoundService/api/v2/WoundAssessmentListGet";

	public static final String	woundAssessmentLoad				= "WoundService/api/v2/WoundAssessmentLoad";

	public static final String	woundAssessmentImageUpload		= "WoundService/api/v2/WoundAssessmentImageUpload";

	public static final String	imageGet						= "v2/ImageGet";

	public static final String	progressNoteSave				= "DocumentationService/api/v1/ProgressNoteSave";

	public static final String	superBillSave					= "DocumentationService/api/v1/SuperbillSave";

	public static final String	patientSearch					= "PatientService/api/v1/patientSearch";

	public static final String	CustomScanUpload				= "DocumentationService/api/v1/CustomScanUpload";

	public static final String	testResultsListGet				= "DocumentationService/api/v1/TestResultsListGet";

	public static final String	testResultsLoad					= "DocumentationService/api/v1/TestResultsLoad";

	public static final String	fileGet							= "DocumentationService/api/v1/FileGet";

	public static final String	getDocumentCategory				= "ConfigService/api/v1/CustomScanGroupAdminGet";

	public static final String	woundListGetV2					= "WoundService/api/v2/WoundListGet";

	public static final String	HBOPreTreatmentAssessmentSave	= "DocumentationService/api/v1/HBOPreTreatmentAssessmentSave";

	public static final String	ProblemListListGet				= "DocumentationService/api/v1/ProblemListListGet";

	public static final String	ProblemListLoad					= "DocumentationService/api/v1/ProblemListLoad";

	public static final String	testResultList					= "DocumentationService/api/v2/TestResultsListGet";

	public static final String	customScanList					= "DocumentationService/api/v2/CustomScanListGet";

}
