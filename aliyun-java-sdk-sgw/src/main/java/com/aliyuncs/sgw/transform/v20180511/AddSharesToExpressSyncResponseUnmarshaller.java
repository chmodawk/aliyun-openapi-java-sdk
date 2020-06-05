/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.AddSharesToExpressSyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSharesToExpressSyncResponseUnmarshaller {

	public static AddSharesToExpressSyncResponse unmarshall(AddSharesToExpressSyncResponse addSharesToExpressSyncResponse, UnmarshallerContext _ctx) {
		
		addSharesToExpressSyncResponse.setRequestId(_ctx.stringValue("AddSharesToExpressSyncResponse.RequestId"));
		addSharesToExpressSyncResponse.setSuccess(_ctx.booleanValue("AddSharesToExpressSyncResponse.Success"));
		addSharesToExpressSyncResponse.setCode(_ctx.stringValue("AddSharesToExpressSyncResponse.Code"));
		addSharesToExpressSyncResponse.setMessage(_ctx.stringValue("AddSharesToExpressSyncResponse.Message"));
		addSharesToExpressSyncResponse.setTaskId(_ctx.stringValue("AddSharesToExpressSyncResponse.TaskId"));
		addSharesToExpressSyncResponse.setMnsTopic(_ctx.stringValue("AddSharesToExpressSyncResponse.MnsTopic"));
		addSharesToExpressSyncResponse.setMnsQueues(_ctx.stringValue("AddSharesToExpressSyncResponse.MnsQueues"));
		addSharesToExpressSyncResponse.setMnsFullSyncDelay(_ctx.longValue("AddSharesToExpressSyncResponse.MnsFullSyncDelay"));
		addSharesToExpressSyncResponse.setMnsPublicEndpoint(_ctx.stringValue("AddSharesToExpressSyncResponse.MnsPublicEndpoint"));
		addSharesToExpressSyncResponse.setMnsInnerEndpoint(_ctx.stringValue("AddSharesToExpressSyncResponse.MnsInnerEndpoint"));
	 
	 	return addSharesToExpressSyncResponse;
	}
}