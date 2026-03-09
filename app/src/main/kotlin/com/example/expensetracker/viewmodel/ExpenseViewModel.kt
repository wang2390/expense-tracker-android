package com.example.expensetracker.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExpenseViewModel : ViewModel() {
    // LiveData to hold a list of expenses
    private val _expenses = MutableLiveData<List<Expense>>()
    val expenses: LiveData<List<Expense>> = _expenses

    // Function to add a new expense
    fun addExpense(expense: Expense) {
        val currentList = _expenses.value ?: emptyList()
        _expenses.value = currentList + expense
    }

    // Function to remove an expense
    fun removeExpense(expense: Expense) {
        val currentList = _expenses.value ?: emptyList()
        _expenses.value = currentList.filter { it != expense }
    }
}