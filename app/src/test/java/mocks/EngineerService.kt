package mocks

import com.example.myapplication.mocks.DatabaseEngineerRepository
import com.example.myapplication.mocks.Engineer
import com.example.myapplication.mocks.EngineerRepository
import com.example.myapplication.mocks.EngineerRole
import com.example.myapplication.mocks.EngineerService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test


class EngineerService {
    private val engineerRepositoryMock: EngineerRepository = DatabaseEngineerRepository()
    private val service = EngineerService(engineerRepositoryMock)
    @Test
    fun save_callsRepository_onlyOnce() {
        val ada = Engineer( "Ada Lovelace", EngineerRole.DEV)

        every { engineerRepositoryMock.save(ada) } returns Unit

        service.save(ada)

        verify(exactly = 1) { engineerRepositoryMock.save(ada) }
    }
}