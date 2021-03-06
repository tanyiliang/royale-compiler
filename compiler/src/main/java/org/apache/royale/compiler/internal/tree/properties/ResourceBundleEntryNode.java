/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.royale.compiler.internal.tree.properties;

import org.apache.royale.compiler.internal.tree.as.ExpressionNodeBase;
import org.apache.royale.compiler.internal.tree.as.FixedChildrenNode;
import org.apache.royale.compiler.internal.tree.as.LiteralNode;
import org.apache.royale.compiler.tree.ASTNodeID;

/**
 * Node that represents a key-value pair in a properties file
 */
public class ResourceBundleEntryNode extends FixedChildrenNode
{
    private LiteralNode keyNode;
    private ExpressionNodeBase valueNode;

    public ResourceBundleEntryNode(LiteralNode keyNode, ExpressionNodeBase valueNode)
    {
        this.keyNode = keyNode;
        this.keyNode.setParent(this);

        this.valueNode = valueNode;
        this.valueNode.setParent(this);

        span(keyNode, valueNode);
    }

    @Override
    public ASTNodeID getNodeID()
    {
        return ASTNodeID.PropertiesEntryID;
    }

    public LiteralNode getKeyNode()
    {
        return keyNode;
    }

    public ExpressionNodeBase getValueNode()
    {
        return valueNode;
    }

}
