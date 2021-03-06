package de.mxro.client.tests

import delight.log.jre.Logs
import de.mxro.client.jre.Clients
import de.mxro.metrics.jre.Metrics
import de.oehme.xtend.junit.JUnit
import delight.async.properties.jre.Properties
import org.junit.Test

@JUnit
class TestCreateAndStop {
	
	
	@Test
	def void test() {
		
		var client = Clients.create

		client.logs.record(Logs.string(this, "I was there."))
		
		client.metrics.record(Metrics.increment("counter"))
		
		client.state.record(Properties.set("123", "456"));
		
		client.stop.get
		
	}
	
	
}