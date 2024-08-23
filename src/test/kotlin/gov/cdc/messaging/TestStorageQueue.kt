package gov.cdc.dex.cloud.messaging

import gov.cdc.messaging.CloudMessaging
import javax.inject.Inject

//@MicronautTest Disabling tests for now because not using message queues
class TestStorageQueue {
    @Inject
    lateinit var messaging: CloudMessaging

  //  @Test
    fun receiveMessages() {
//        println("testing receive messages")
//        println(messaging.getQueueUrl())
//        do {
//            val msgs = messaging.receiveMessage()
//            msgs.forEach {
//                println(it.key())
//            }
//        } while (msgs.isNotEmpty())
        assert(true)
    }
}