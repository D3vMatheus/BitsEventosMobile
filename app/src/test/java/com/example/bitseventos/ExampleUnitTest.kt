package com.example.bitseventos

import org.junit.Test

import org.junit.Assert.*

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainActivityTest {

    @Mock
    private lateinit var mockEmailEditText: EditText

    @Mock
    private lateinit var mockPasswordEditText: EditText

    @Mock
    private lateinit var mockLoginButton: Button

    @Mock
    private lateinit var mockForgotPasswordTextView: TextView

    @Mock
    private lateinit var mockToast: Toast

    private lateinit var mainActivity: MainActivity

    @Before
    fun setUp() {
        mainActivity = MainActivity()
        mainActivity.emailEditText = mockEmailEditText
        mainActivity.passwordEditText = mockPasswordEditText
        mainActivity.loginButton = mockLoginButton
        mainActivity.forgotPasswordTextView = mockForgotPasswordTextView
    }

    @Test
    fun testLoginWithEmptyFields() {
        `when`(mockEmailEditText.text).thenReturn(null)
        `when`(mockPasswordEditText.text).thenReturn(null)

        mainActivity.onLoginButtonClick() // Simulate button click

        verify(mockToast).makeText(mainActivity, "Please enter email and password", Toast.LENGTH_SHORT)
    }

    @Test
    fun testLoginWithInvalidCredentials() {
        `when`(mockEmailEditText.text).thenReturn("invalid@example.com")
        `when`(mockPasswordEditText.text).thenReturn("invalid_password")

        mainActivity.onLoginButtonClick() // Simulate button click

        verify(mockToast).makeText(mainActivity, "Incorrect email or password", Toast.LENGTH_SHORT)
    }

    @Test
    fun testLoginWithValidCredentials() {
        `when`(mockEmailEditText.text).thenReturn("example@email.com")
        `when`(mockPasswordEditText.text).thenReturn("password")

        mainActivity.onLoginButtonClick() // Simulate button click

        verify(mockToast).makeText(mainActivity, "Login successful", Toast.LENGTH_SHORT)
    }

    @Test
    fun testForgotPasswordClicked() {
        mainActivity.onForgotPasswordClicked()

        verify(mockToast).makeText(mainActivity, "Forgot password clicked", Toast.LENGTH_SHORT)
    }
}