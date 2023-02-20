package com.ingeniovirtual.test_authcomposefirebase.di

import com.google.firebase.auth.FirebaseAuth
import com.ingeniovirtual.test_authcomposefirebase.data.AuthRepository
import com.ingeniovirtual.test_authcomposefirebase.data.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository = impl

}