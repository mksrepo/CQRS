package com.ford.risk.coreapi

import org.axonframework.modelling.command.TargetAggregateIdentifier

// RISK COMMANDS
// command to initiate risk evaluation process for raised proposal
data class InitiateRiskEvaluationCommand(@TargetAggregateIdentifier val proposalId: String, val riskEvaluationStatus: String)
// command to receive customer exposure data
data class ReceiveCustomerExposureCommand(@TargetAggregateIdentifier val proposalId: String, val riskEvaluationStatus: String, val exposureAmount: Double)
// command to check customer POP score
data class CheckCustomerPopScoreCommand(@TargetAggregateIdentifier val proposalId: String, val riskEvaluationStatus: String, val popScore: Double)
// command to complete/finalise risk evaluation process for raised proposal
data class CompleteRiskEvaluationCommand(@TargetAggregateIdentifier val proposalId: String, val riskEvaluationStatus: String)
// command to call Hunter service to save customer details
data class CallHunterServiceCommand(@TargetAggregateIdentifier val proposalId: String)

// RISK EVENTS
data class RiskEvaluationInitiatedEvent(val proposalId: String, val riskEvaluationStatus: String)
data class CustomerExposureReceivedEvent(val proposalId: String, val riskEvaluationStatus: String, val exposureAmount: Double)
data class CustomerPopScoreCheckedEvent(val proposalId: String, val riskEvaluationStatus: String, val popScore: Double)
data class RiskEvaluationCompletedEvent(val proposalId: String, val riskEvaluationStatus: String)
data class HunterServiceCalledEvent(val proposalId: String)